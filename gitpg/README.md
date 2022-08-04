# GIT Playground
This folder can be used to practice git commands. For any change you add, make sure to use your own branch!

# Commit Best Practices
As best practices, commit must follow the following rules:
- Commit messages must be meaningful, it should briefly describe what changes are being commited
- Commit messages must be simple, it should not be longer than 100 chars long
- Commit changes must be small, for example, instead of push changes in 10 files in one single commit, try to identify smaller groups of changes that can be separated in multiple commits, say first commit modifies 1 file, second commit modifies 3 files, third commit modifies 2 files, fourth commit modifies 4 files.

Example of GOOD commit message
```
Add best practices for commit messages in README file
```

Example of BAD commit message
```
Add changes to README
```

# Assignment

## Practice 1
1. Create local repository "Movies"
2. Create file Comedy.txt, add to staging area and commit with message "Add Comedy.txt file"
3. Create file Action.txt, add to staging area and commit with message "Add Action.txt file"
4. Create file Horror.txt, add to staging area and commit with message "Add Horror.txt file"
5. Edit Comedy.txt file, add 5 comedy movie names (one per line), add to staging area and commit with message "Add comedy movies to Comedy.txt file"
6. Edit Action.txt file, add 5 action movie names (one per line), add to staging area and commit with message "Add action movies to Action.txt file"
7. Edit Horror.txt file, add 5 horror movie names (one per line), add to staging area and commit with message "Add horror movies to Horror.txt file"

## Practice 2
1. Create a branch \<your name\>/userinfo and switch to created branch
2. Under this folder (gitpg), create a folder using your first name, all lowercase
3. Under gitpg/\<your name\> folder, add a file "userinfo"
4. Edit userinfo file and add your full name
5. Commit changes (apply Commit Best Practices)
6. Edit userinfo file and add you birth date in a new line
7. Commit changes (apply Commit Best Practices)
8. Edit userinfo file and add you carer name in a new line
9. Commit changes (apply Commit Best Practices)
10. Edit userinfo file and add you residence city in a new line
11. Commit changes (apply Commit Best Practices)
12. Push your branch \<your name\>/userinfo to remote repo

## Practice 3
1. Make sure to have a local branch tracking remote dev/info branch
2. Switch to dev/info branch
3. Create a branch \<your name\>/techinfo and switch to created branch
4. Under gitgp/\<your name\> folder, add a file "techinfo"
5. Edit techinfo file and list your favorite programming languages separated by commas in one single line
6. Commit changes (apply Commit Best Practices)
7. Edit techinfo file and list your favorite code editors or IDEs separated by commas in a new line
8. Commit changes (apply Commit Best Practices)
9. Edit techinfo file and add your favorite OS in a new line
10. Commit changes (apply Commit Best Practices)
11. Push your branch \<your name\>/techinfo to remote repo

## Practice 4
1. Switch to dev/info branch
2. Create a branch \<your name\>/hobbyinfo and switch to created branch
3. Under gitgp/\<your name\> folder, add a file "hobbyinfo"
4. Edit hobbyinfo file and list your favorite sports separated by commas in one single line
5. Commit changes (apply Commit Best Practices)
6. Edit hobbyinfo file and list your music genres separated by commas in a new line
7. Commit changes (apply Commit Best Practices)
8. Edit hobbyinfo file and add your favorite movies in a new line
9. Commit changes (apply Commit Best Practices)
10. Push your branch \<your name\>/hobbyinfo to remote repo

## Practice 5
1. Switch to dev/info branch
2. Create a branch \<your name\>/machineinfo and switch to created branch
3. Under gitgp/\<your name\> folder, add a file "machineinfo"
4. Edit machineinfo file and add your CPU brand/model in one single line
5. Commit changes (apply Commit Best Practices)
6. Edit machineinfo file and add your RAM capacity in a new line
7. Commit changes (apply Commit Best Practices)
8. Edit machineinfo file and add your storage capacity in a new line
9. Commit changes (apply Commit Best Practices)
10. Push your branch \<your name\>/machineinfo to remote repo

# Cheatsheet

List configurations
```
git config --list
```

Configure username and email
```
git config user.name <your name>
git config user.email <your email>
```

List local branches
```
git branch
```

Create local branch
```
git branch <branch name>
```

Switch to local branch
```
git checkout <branch name>
```

Check repo status
```
git status
```

Add changes to staging area
```
git add <filename>
```

Commit changes
```
git commit -m <commit message>
```

Create remote branch
```
git push -u origin <local branch name>
```