package com.nguyenvuluan.socialapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_container_video.view.*

class VideoAdapter constructor(private val videoItems: List<VideoItem>) :
    RecyclerView.Adapter<VideoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        return VideoViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_container_video, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return videoItems.size
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        holder.onBind(videoItems[position])
    }

}

class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun onBind(videoItem: VideoItem) {
        itemView.tvVideoTitle.text = videoItem.videoTitle
        itemView.tvVideoDescription.text = videoItem.videoDescription
        itemView.videoView.setVideoPath(videoItem.videoURL)
        itemView.videoView.setOnPreparedListener {
            itemView.pbVideo.visibility = View.GONE
            it.start()

            val videoRatio: Float = it.videoWidth / it.videoHeight.toFloat()
            val screenRatio: Float = itemView.videoView.width / itemView.height.toFloat()
            val scale = videoRatio / screenRatio
            if (scale >= 1F)
                itemView.videoView.scaleX = scale
            else
                itemView.videoView.scaleY = 1F / scale
        }
        itemView.videoView.setOnCompletionListener { it.start() }
    }
}