# LaborDay
Git Notes

Git is a free and open source disrtibuted Version Control System designed to handle everything from small to very large projects w/speed and effiency. -auto saves, can view the history -Local version control saved on local computer

*Centralized Version Control -all team members have access to one main copy, saved on server *Distributed Version Control -(git) complete project and history is copied to all developer's hard drive

Characteristics of Git -stores each saved version of the project as a snapshot of everything in the project. -every time you commit, you're creating a snapshot -git is enhanced for local development (can work offline) -git is explicit (implicit: something that's done for you by other code behind the scenes. explicit: the approach to accomplishing the change you want done by writing clear instructions to be done.) -git is designed for non-linear development (branching)

Different Statuses of your file Tracked or Untracked

*Tracked: -Unmodified- no unsaved changes -Modified- when you made changes not saved -Staged- staging what it will look before saving

Different Directories

.git - hidden directory stored at the root level of your project (saved folders)
*Working Directory - perform the work, changes to files being made project *Index/Stages Directory (cache) -files ready to be saved or committed to the next project Git project = Git repository -a repository contains all of your project files revision history

Git Commands *Git Basics -git init: creates a new repository and begins tracking -git add: move modified files into the staging area -git status: shows you the status of your files -git commit: create a snapshot and commit to .git -git config: set and read specific git configurations -git log: shows the commited snapshot history -git diff: shows changes between your working directory and staging area

*Git Branches -git branches: List, create, or delete branches -git checkout: switch between branches -git merge: bring changes from one branch into another

*Remote Repositories: -git clone: Copies an entire repository into a new local .git directory -git remote: Create and show linked repository -git push: Send updates to associate repositories -git pull: Retrieves and integrates changes from other repositories -git fetch: Retrieves but doesn't integrate changes from other repositories

Undoing Changes -git revert: create a new commit that undoes a previous commit -git reset: remove files from the staging area

to get information: git --help ex: git add --help never remove .git

Git Configuration Levels 1. system - systemwide level and applied to all users on a machine 2. global - user level and will apply to all git repositories used under that user 3.local - specific settings to a single git repository that will only apply to that one repository.

To change branches/add -git branch -git checkout

git add -p (patch): scan through changes in one file and select specific file line changes while leaving others in the working directory

git merge(to merge another branch onto a current branch)

git history command: git log / visual representation: git log --oneline --graph

delete branch: git branch -d
