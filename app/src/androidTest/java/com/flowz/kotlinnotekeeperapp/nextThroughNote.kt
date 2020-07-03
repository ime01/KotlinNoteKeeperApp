package com.flowz.kotlinnotekeeperapp

import org.junit.Assert.*

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matchers
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.CoreMatchers.*
import java.util.EnumSet.allOf
import kotlin.reflect.typeOf


@RunWith(AndroidJUnit4::class)
class nextThroughNote(){

    @Rule @JvmField
    val noteListActivity = ActivityTestRule(MyNoteActivity::class.java)

    @Test
    fun nextThroughNotes(){
        

        //course uses Listview for this test, presently app has moved to the next course and now uses recyclerview

        onData(allOf(instanceOf(NoteInfo::class.java), equalTo(DataManager.notes[0]))).perform(click())

        for (index in 0..DataManager.notes.lastIndex){

            val note = DataManager.notes[index]


            onView(withId(R.id.spinnerCourses)).check(matches(withSpinnerText((note.course?.title))))

            onView(withId(R.id.textNoteTitle)).check(matches(withText((note.title))))

            onView(withId(R.id.textNoteText)).check(matches(withText((note.text))))


            if (index != DataManager.notes.lastIndex){

                onView(allOf(withId(R.id.textNoteTitle), isEnabled())).perform(click())

            }

            onView(withId(R.id.action_next)).check(matches(((isEnabled()))))

        }

    }


}