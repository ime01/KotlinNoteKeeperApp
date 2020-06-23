package com.flowz.kotlinnotekeeperapp

object DataManager {

    val courses = HashMap<String, CourseInfo>()

    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeNotes() {

    }


    private fun initializeCourses(){

        var course = CourseInfo("android_intents", "Android Programming with Intents")
       courses.set(course.courseId, course)

       course = CourseInfo(courseId = "android_async", title =  "Android Async Programming and services")
       courses.set(course.courseId, course)

       course = CourseInfo(title =  "Java Fundamentals: The Java Language", courseId = "Java_lang")
       courses.set(course.courseId, course)

       course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
       courses.set(course.courseId, course)

   }


}