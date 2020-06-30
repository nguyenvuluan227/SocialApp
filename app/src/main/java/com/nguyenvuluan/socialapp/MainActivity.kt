package com.nguyenvuluan.socialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoItems = ArrayList<VideoItem>()
        val videoItemCelebration = VideoItem()
        videoItemCelebration.videoURL = "https://www.infinityandroid.com/videos/video1.mp4"
        videoItemCelebration.videoTitle = "Celebration"
        videoItemCelebration.videoDescription =
            "Celebrate who you are in your deepest heart. Love your self and the world will love you"
        videoItems.add(videoItemCelebration)

        val videoItemParty = VideoItem()
        videoItemParty.videoURL = "https://www.infinityandroid.com/videos/video2.mp4"
        videoItemParty.videoTitle = "Party"
        videoItemParty.videoDescription = "You gotta have life your way"
        videoItems.add(videoItemParty)

        val videoItemExercise = VideoItem()
        videoItemExercise.videoURL = "https://www.infinityandroid.com/videos/video3.mp4"
        videoItemExercise.videoTitle = "Exercise"
        videoItemExercise.videoDescription =
            "Whenever i feel the need to exercise, I lie down until it goes away"
        videoItems.add(videoItemExercise)

        val videoItemNature = VideoItem()
        videoItemNature.videoURL = "https://www.infinityandroid.com/videos/video4.mp4"
        videoItemNature.videoTitle = "Nature"
        videoItemNature.videoDescription =
            "In every walk in with nature on receives far more than he seeks"
        videoItems.add(videoItemNature)

        val videoItemTravel = VideoItem()
        videoItemTravel.videoURL = "https://www.infinityandroid.com/videos/video5.mp4"
        videoItemTravel.videoTitle = "Travel"
        videoItemTravel.videoDescription =
            "It is better to travel well than to arrive"
        videoItems.add(videoItemTravel)

        val videoItemChill = VideoItem()
        videoItemChill.videoURL = "https://www.infinityandroid.com/videos/video6.mp4"
        videoItemChill.videoTitle = "Chill"
        videoItemChill.videoDescription =
            "Life is so much easier when you just chill out"
        videoItems.add(videoItemChill)

        val videoItemLove = VideoItem()
        videoItemLove.videoURL = "https://www.infinityandroid.com/videos/video7.mp4"
        videoItemLove.videoTitle = "Love"
        videoItemLove.videoDescription =
            "The best thing to hold onto in life is each other"
        videoItems.add(videoItemLove)

        vpVideo.adapter = VideoAdapter(videoItems)
    }
}