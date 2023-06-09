# Operating Systems and Becoming a Power User

## Introduction to Operating Systems and Becoming a Power User

### Course Intro

- Some conceptual learning but also practical learning

### Lesson Overview and Practice Tips

- The command line interpreter in Linux is called a shell and the language that we'll use to interact with this shell is called Bash
- 2 Themes for this lesson
  - Navigating from one directory to another
  - Getting file information
  - Removing files and directories
- File and Text Manipulation
  - Searching through directories
  - Find a specific file
  - copying and pasting
  - Chaining commands

### List Directories in a GUI

- The command line interpreter in Linux is called a shell and the language that is used to interact with this shell is called Bash
- File systems are used in a hierarchial manner where there is a root to everything and folders and files will continue to build out the tree
- Root Directory: The parent for all other directories in the file system
- The root directory of C: would be written as C:\ and the root directory of X: would be written as X:\
- Subdirectories are separated by backslashes `\`unlike Linux which uses forward slashes `/`
- The main directory on a windows system is the drive that the file system is stored on
- On Windows: to view hidden files on the current directory go to view tab and select hidden files
  - To view information on a file just right click and select properties

### Windows: List Directories in CLI

- Command Prompt: cmd.exe
- PowerShell: powershell.exe
- `ls` - list directory
- The C: drive root folder is what we call a parent directory and the contents inside are considered the child directories
- `get-Help` `command` `-Full` this will get a full description of the command trying to access help for
- `ls -Force` to show hidden files when using ls command

### Linux List Directories

- the root directory in linux is shown with a `/` instead of the C: call in windows
- `ls /` to list all of the files inside the root directory
  - In Root Directory there may be the following:
    - `bin`: stores essential binaries for programs, similar to program files directory
    - `etc`: Stores system configuration settings
    - `home`: Personal directory for users i.e. user documents, pictures and alike
    - `proc`: Information for currently running processes
    - `usr`: meant for user installed software
    - `var`: used for system logs or any file that changes on the OS
- Similar to windows commands and parameters a flag is a way to specify additional options for a command
- `-- help` flag: used for finding more information on what parameter and how to use a particular command
- `man` `command to look up` : this will give you the manual for the command you want to look at
- `ls -l` gives long list information in a directory
- ![ls -l Command ex](ScreenShots/Screenshot%202023-06-09%20at%202.41.20%20AM.png)
  - The first section is reserved for file permissions
  - The second column is for the number or links the file has
  - The third is for the file owner
  - Fourth is for group the file belongs to
  - Fifth file size
  - Sixth time stamp
  - Eight will be the directory location

### GUI Directories

- Absolute Path: One that starts from the main directory
- Relative Path: The path from your current directory

### Windows: Changing Directories in the CLI

- `pwd` will tell you what directory you are currently in
- `cd <path to location>` will change the directory to the file path you provide
- Tab completion is also available in Windows and will fill in the command

### Linux: Changing Directories in Bash

- `pwd` and `cd` work the same way as they do in Windows
- Tab complete in bash will show options instead of cycling through the options

### Windows: Make Directories

- `mkdir <directory_Name>` to create a new directory
- To use literal spaces in the command input using quotes will allow you to use the spaces
