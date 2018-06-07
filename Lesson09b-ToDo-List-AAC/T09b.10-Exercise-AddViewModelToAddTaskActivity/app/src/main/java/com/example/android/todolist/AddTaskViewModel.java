package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

// TODO DONE(5) Make this class extend ViewModel
public class AddTaskViewModel extends ViewModel{

    // TODO DONE(6) Add a task member variable for the TaskEntry object wrapped in a LiveData
    private LiveData<TaskEntry> task;

    // TODO DONE(8) Create a constructor where you call loadTaskById of the taskDao to initialize the task variable
    // Note: The constructor should receive the database and the taskId
    public AddTaskViewModel(AppDatabase mDb, int taskId) {
        this.task = mDb.taskDao().loadTaskById(taskId);
    }

    // TODO DONE(7) Create a getter for the task variable
    public LiveData<TaskEntry> getTask() {
        return task;
    }
}
