# Week 5

## Planning for Data Recovery

### What is Data Recovery?

- Data Recovery, the process of trying to restore data after an unexpected event that results in data loss or corruption
- when an unexpected event occurs, your main objective is to resume normal operations as soon as possible, while minimizing the disruption to business functions
- The best way to be prepared for a data-loss event is to have a well-thought-out diaster plan and procedure in place
- Disaster plans should involve making regular backups of any and all critical data that's necessary for your ongoing business processes
- A post-mortem is a way for you to document any problems you discovered along the way, most importantly, the ways you fixed them so you can make sure they don't happen again
  <https://about.gitlab.com/blog/2017/02/01/gitlab-dot-com-database-incident/> Gitlab database incident

### Backing up your data

- key things to keep in mind when designing a data recovery plan:
  - what data you need to backup? back up data that is necessary for operations
    - email databases
    - sales databases
    - financial spreadsheets
    - server configurations
    - databases
  - Find out how much data you have to backup
    - account for current data size
    - predict future growth and accommodate for data as needed
    - backing up data is not free
  - Onsite backup solutions
    - pros:
      - data is physically nearby
      - low bandwidth needs
    - cons:
      - Data loss due to damage at location
  - Offsite backups
    - pros:
      - data is sager in multiple locations
    - cons:
      - needs security and encryption
      - needs large amounts of bandwidth

### Backup Solutions

- how to choose between self managed backups or cloud providers
- it is recommended to use both onsite and offsite backups if it is with in the organizations budget
- backup time period, meaning how long should you hold on to backups and how often backups would need to be performed
- rsync, a file transfer utility that's designed to efficiently transfer and synchronize files between locations or computers
- rsync uses compression and uses SSH to securely transfer data over a network
- microsoft offers backup and restore, two modes of operation a file based version where files are backed up to a zip archive or theres the system image where the entire disk saved block by block to a file

<https://wiki.archlinux.org/title/rsync#As_a_backup_utility>
<https://support.microsoft.com/en-us/windows/back-up-your-windows-pc-87a81f8a-78fa-456e-b521-ac0560e32338> microsoft backup and restore

### Testing Backups

- it is not sufficient to just set up regular backups, the other process that is just as important is to test the recovery process
- Restoration procedures, should be documented and accessible so that anyone with the right access can restore operations when needed
- everyone should practice restoration procedures so that when the time comes to restore a back up the people who have a role in this are able to know what they have to do.
- Document procedures make sure it works now and in the future

### Types of Backup

- how and when to backup data
- Way to perform regular backups
  - full backup, not ideal backs up everything even files that have not changed
  - differential backup, only the files that have changed are backed up
- it's a good practice to perform infrequent full backups, while also doing more frequent differential backups
- Regular incremental backups
- while a differential backup back up files that have been changed or created since the last full backup, an incremental backup is when only the data that's change in files since the last incremental backup is backed up
- this is more efficient with disk space and time required compared to differential backups
- by doing more and more incremental backups the time to restore the data could be slower because the data would have to be created from the last full backup and all of the changes applied to each file as the latest changes are applied
- not all data types are able to be compressed
- compression and decompression is another important concept to keep in mind when storing the backup files
- Redundant Array of Independent Disks (RAID), a method of taking multiple physical disks and combining them into one large virtual disk
- RAID arrays are a great inexpensive way of creating a lot of ddat capacity while minimizing data loss in the event of data loss
- RAID is not a replacement for backups

<https://en.wikipedia.org/wiki/Standard_RAID_levels> entry on RAID levels

### User Backups

- constructing infrastructure backups is not as complicated as creating client device back ups
- one option is to use a cloud platform that would backup across platforms and devices
  - examples:
  - dropbox
  - apple icloud
  - google drive
- The user gets to choose what files are backed up

## Disaster Recovery Plans

### What's a disaster Recovery Plan?

- Disaster recovery plan, a collection of documented procedures and plans on how to react and handle an emergency or disaster scenario, from the operational perspective
- includes things that should be done before, during, and after a disaster.
- preventive measures, any procedures or systems in place that will proactively minimize the impact of a disaster
- detection measures, meant to alert you and your team that a disaster has occurred that can impact operations
- Other detection solutions are:
  - Environmental sensors
  - flood sensors
  - temperature and humidity sensors
  - smoke detectors and fire detectors
  - evacuation procedures
- Corrective or recovery measures, those enacted after a disaster has occurred

### Designing a disaster recovery plan

- there is no one way to designing a disaster recovery plan
- things to plan for:
  - perform a risk assessment
    - Risk assessment, allows you to prioritize certain aspects of the organizations that are more at risk if there's an unforeseen event
    - can include brainstorming situations and understand the impact of those operations
    - look at systems that do not have redundancy
  - Determine Backup and Recovery Systems
    - ideally you should have regular backup procedures that backup locally and externally to the organization
    - anything critical should have redundancy operations
    - Operational documentation, make sure that all operations to be able to backup severs are written and reachable
    - periodically make sure that the steps/documentation actually work 
  - Determine Detection & Alert Measures 
    - determine internet connections that are available 
  
## Post Mortem

### What is post-mortem? 

- we create a post-mortem after an incident, an outage, or some event when something goes wrong, or at the end of a project to analyze how it went 
- the purpose is to learn something from an event and not to punish any particular person 
- once the report is completed make sure you share with other teams and people who may benefit from the event 

### Writing a Post-Mortem 

- begins with a brief summary
  - includes: 
    - what the incident was
    - how long it lasted
    - what the impact was 
    - how it was fixed 
- Detailed Timeline 
  - includes: 
    - everything that happened in the event
    - when the event began 
    - when people where notified 
    - when people began working the event 
    - wraps up the conclusion of the event 
- Root Cause: 
  - this will be an honest detail of what led to the issue 
- Resolution and recovery Efforts 
  - details of what was done to fix the issue along with the rationale for why why those steps where taken 
- Actions to Avoid Same Scenario
- An overlooked are is 'what went well' give this focus 
- 