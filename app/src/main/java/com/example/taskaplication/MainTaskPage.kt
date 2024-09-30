package com.example.taskaplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialogDefaults.titleContentColor
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.taskaplication.ui.theme.TaskAplicationTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTaskPage(navController: NavController)
{
    val navigator = remember { navController }
    val modifier = Modifier

    Scaffold (
        modifier.fillMaxSize(),

        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Tasks")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                )
            )
        },
        floatingActionButton = {
            Button(onClick = { /*TODO*/ }) {
                Text("Add Task")
            }
        }
    ) {
        Column(
            modifier.padding(it)
        ) {
            TaskCard("Task 1", "Description 1")
            TaskCard("Task 1", "Description 1")
        }
    }
}

@Composable
fun TaskCard(taskTitle: String, taskDescription: kotlin.String) {
    val modifier = Modifier

    Card(
        modifier
            .padding(10.dp)
            .border(
                BorderStroke(3.dp, MaterialTheme.colorScheme.primary),
                shape = MaterialTheme.shapes.medium
                )
    ) {
        Row(
            modifier.fillMaxWidth()
            .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(taskTitle)
            Button(onClick = { /*TODO*/ }) {
                Text("Edit")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainTaskPagePreview() {
    val navController = rememberNavController()
    TaskAplicationTheme {
        MainTaskPage(navController)
    }
}

