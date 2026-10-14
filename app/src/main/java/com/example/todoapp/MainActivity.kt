package com.example.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todoapp.ui.navigation.AppNavigation
import com.example.todoapp.ui.theme.TodoappTheme
import com.example.todoapp.viewmodel.TaskViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodoappTheme {
                val viewModel: TaskViewModel = viewModel()
                AppNavigation(viewModel = viewModel)
            }
        }
    }
}