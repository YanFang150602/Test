# Test
初始化git仓
git init
关联远程仓
git remote add origin git@github.com:YanFang150602/Test.git

关联远程仓上的分支
git push --set-upstream origin master

git push报错：
C:\development\IdeaWorkspace\Test>git push
To github.com:YanFang150602/Test.git
 ! [rejected]        master -> master (non-fast-forward)
error: failed to push some refs to 'git@github.com:YanFang150602/Test.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

执行了git pull 无用，依然报错

后执行：
git pull --rebase origin master

成功
git push 