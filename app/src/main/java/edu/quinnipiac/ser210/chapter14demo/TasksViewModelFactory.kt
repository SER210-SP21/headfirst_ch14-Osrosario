package edu.quinnipiac.ser210.chapter14demo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TasksViewModelFactory(private val dao: TaskDAO) : ViewModelProvider.Factory
{
    override fun <T : ViewModel> create(modelClass: Class<T>): T
    {
        if (modelClass.isAssignableFrom(TasksViewModel::class.java))
        {
            return TasksViewModel(dao) as T
        }

        throw IllegalAccessException("Unknown ViewModel")
    }
}