

# Time-up

A simple and visually appealing web-based routine manager to help you track daily tasks with deadlines, progress tracking, and task status management. This app is designed to be adapted easily into an Android app or any web environment.

## Features

* Add tasks with deadlines (time) and descriptions.
* View tasks in a tabular format with deadline, task name, and status.
* Toggle task status between incomplete and completed.
* Automatically disables toggling for tasks past their deadline.
* Progress bar indicating overall life progress, adjusting dynamically based on completed and expired tasks.
* Persistent data storage per day using `localStorage`.
* Clear all tasks option with confirmation.
* Displays current day.
* Responsive and user-friendly UI with gradient backgrounds and stylish toggle switches.

## Screenshots

*(Add screenshots of your app here if available)*

## Installation

Since this is a web-based project, you can run it directly in any modern web browser.

1. Clone or download this repository.
2. Open the `index.html` file in your browser.

## Usage

* Enter a deadline time and a task description.
* Click "Add Task" to add it to your daily routine.
* Use the toggle switch to mark tasks as completed.
* Delete individual tasks or clear all tasks.
* The progress bar will update automatically based on your task completion and expired tasks.
* The app saves your tasks locally by the current day and loads them when you revisit.

## How to use in Android

You can wrap this web app in a WebView inside an Android app to create a simple native Android application. Alternatively, tools like **Apache Cordova**, **Capacitor**, or **React Native WebView** can help you package it easily.

## Code Highlights

* **HTML5 & CSS3**: Modern and clean UI with gradients and responsive design.
* **JavaScript**:

  * Task management (add, update, delete).
  * Task status toggling with automatic disabling for expired tasks.
  * Local storage to save tasks per day.
  * Dynamic progress bar updating based on completed and expired tasks.
  * Formatting time to 12-hour AM/PM format.
  * Day display based on current date.

## Future Improvements

* Sync tasks with cloud storage or a backend server.
* Add notifications or reminders for upcoming deadlines.
* Support editing existing tasks.
* Dark mode support.
* More detailed progress metrics or charts.

## License

This project is open source and free to use.
