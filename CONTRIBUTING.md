## How to contribute

Here you will learn how you can contribute to this project and can make your first contribution

## 1. Fork this repository

You can fork this repository by clicking on fork button on top right corner. Once you fork this will create a copy of repo on your account 

## 2. Clone the repository

To clone the repository go to your account open this repo and either click on clone button or run the command below to get this repository on your local machine

> git clone "URL you just copied"

e.g. git clone https://github.com/yourgithubusername/Your-First-Open-Source-Contribution.git

## 3. Create a branch

On your local machine go the project folder that you cloned and use following `git` command inside that folder

create a new branch using below command

> git checkout -b <add-your-github-username>

e.g. git checkout -b add-owais431

## 4. Lets make some contributions

On your local machine open `Data` folder in repository and change `contributor.json` file and add your details in contributors array as follow

> {
    "Name":"Name"
    "imgURL":"URL to your image"
    "Description": "Small Description about you"
}

## 5. Add Changes and Commit Changes

Now we have to add changes that we made to the branch so for that we will run following command

> git add Data/contributors.json

Now we have to commit changes, commit message should always be clear, to commit use command below

> git commit -m "Add my-name to the list of contributors"

## 6. Push changes to GitHub

Now we have to push the changes that we made to remote repository on specified branch to do so use command below

> git push origin name-of-your-branch

name of branch is same as you created in `step 3`

## Submit your changes for review

Once you have pushed your code to GitHub, now it's time to create `pull request`, you will go to the repository click on `compare and pull request` and submit the pull request.