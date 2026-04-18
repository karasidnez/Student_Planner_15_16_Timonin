package com.timonin.student_planner.data

data class Lesson(
    val id: String,
    val dayOfWeek: String,
    val timeRange: String,
    val name: String,
    val room: String,
    val professor: String
)
