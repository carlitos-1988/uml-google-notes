# Week 5

## Life of a Process

### Module intro

- introducing processes
- reading process output
- track resources

### Programs vs Processes Revisited

- applications are those that we can run like the chrome web browser
- processes are programs that are running
- background processes are also known as daemon processes

### Windows: Process Creattion and Termination

- `smss.exe` is in charge of setting stuff up for the user when initialy logging in to the machine
- `csrss.exe` responsible for setting up the the GUI and the command line console
- In windows processes can operate indipendently of their parents
- `taskkill` will use a `PID` to find and kill a particular process
- `taskkill /pid 5587` will kill task with pid 5587

<https://learn.microsoft.com/en-us/windows-server/administration/windows-commands/taskkill> Task Kill additional information

### Linux: Process Cretion and Termination

- In linux processes have a parent child relationship
- This means that every process that is launched comes from another process
- When you startup your computer, the kernel creates a process called `init`, which has a PID of 1
- when processes terminates it will usually terminate and release the resources they where using at the same time

## Managing Processes

### Windows: Reading Process Information

- the task manager or `taskmgr.exe` is one method of obtaining task information
- In the processes tab you can see the currently active running processes
- to get the pid number for a task go to the details page of task manager here you can find the pid
- `tasklist` in the CLI to be able to see all running processes
- `Get-Process` in Powershell to do the same thing
  <https://learn.microsoft.com/en-us/powershell/module/microsoft.powershell.management/get-process?view=powershell-5.1> Get_Process Documentation

### Linux: Reading Process Information

- `ps -x` shows a snapshot of the processes running on the system
- `Stat`
  - `R` means that the process is running
  - `T` means process is stopped
  - `S` interruptible Sleep
- `TIME` total CPU time the process has taken CPU time
- `ps -ef` shows full details about a process
- `ps -ef | grep Chrome` this is to be used when looking for the Chrome process with full details
- `ls -l /proc` to list all of the directories of the running processes
  <https://man7.org/linux/man-pages/man1/ps.1.html> Linux Manual page

### Windows:Signals

- Signal, a way to tell a process that something's just happened
- `SIGINT` one of the most common signals stands for signal interrupt
- can be ran with `CTRL-C`

### Linux Signals

- `SIGINT` works the same as in windows by interrupting process of an application
- same thing when in the middle of the application would be `ctrl-c`

### Windows: Managing Processes

- Process Explorer, a utility Microsoft created to let IT support specialists, sys admins and other users look at running processes
- process explorer is an application to download and will show all actively running processes on the machine

<https://learn.microsoft.com/en-us/sysinternals/downloads/process-explorer> Process Explorer

### Linux: Managing Processes

- `kill` sends a `sigterm` signal
- `kill 1035` this will kill the firefox process the 1035 is the pid
- `kill -KILL 10392` another way to end a process
- the `kill -KILL` is the last chance way to kill a process this way it is like a hard stop command
- `kill -TSTP 1054` this will put the PID passed in in a suspended state
- `kill -CONT 1054` this will change the process status from suspended to continued

### Mobile App Management

- services running are usually not accessible with mobile management 

## Process Utilization

### Windows: Resource Monitoring 

-  Resource Monitoring application 
-  `npm` in `Get-Process` the npm k means how much non process memory the process is taking 
-  `Get-Process | Sort CPU -decending | Select -first 3 -Property ID, ProcessName, CPU` this command will get the top 3 processes running on the system 
  <https://learn.microsoft.com/en-us/powershell/module/microsoft.powershell.management/get-process?view=powershell-5.1#outputs> Windows diagnostic processes in Windows 

### Linux: Resource Monitoring 

- a useful command for linux resource allocations 
- `top` will show a list of top processes running on the machine 
- `uptime` shows information of the current uptime of the machine showing users, current on time, and the load average 
- `lsof` will list open files and what processes are using them 

### Supplemental Reading for Resource Monitoring in Linux

![Alt text](<ScreenShots/Screenshot 2023-09-29 at 2.55.06 PM.png>)

![Alt text](<ScreenShots/Screenshot 2023-09-29 at 2.55.19 PM.png>)

![Alt text](<ScreenShots/Screenshot 2023-09-29 at 2.55.30 PM.png>)

![Alt text](<ScreenShots/Screenshot 2023-09-29 at 2.55.42 PM.png>)