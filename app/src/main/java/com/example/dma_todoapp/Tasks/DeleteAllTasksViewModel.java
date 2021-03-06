package com.example.dma_todoapp.Tasks;

import android.app.Application;

import com.example.dma_todoapp.Task.TaskRepository;
import com.example.dma_todoapp.Task.TaskEntry;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class DeleteAllTasksViewModel extends AndroidViewModel {
    TaskRepository taskRepository;
    private LiveData<List<TaskEntry>> tasks;

    public DeleteAllTasksViewModel(@NonNull Application application) {
        super(application);
        taskRepository = TaskRepository.getInstance(application);
    }
    public void deleteAllTasks(){
        taskRepository.deleteAllTasks();
    }
}