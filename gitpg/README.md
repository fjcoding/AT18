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