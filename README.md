# Java Tutorial

이 공간은 자바 공부 중 작성하는 공간입니다.

# 이모티콘 기호별 간단 의미

🍩 : 현재 공부 중에 있는 지식에 대한 내용을 서술한 구간이며 정확하지 않을 수 있습니다.

🍌 : 복사, 붙여넣기하는 구간이며 내용에 관해 사전 지식이 부족한 내용입니다.

🍭 : 경고나 주의 혹 에러에 대한 내용을 기술한 구간입니다.

# 🍩 github commit & push

git bash 혹 WSL terminal 실행

`$ git init` : github에 연결.

`$ git remote add origin https//github.com/"username/repository"` : git repository 경로로 원격 지정. "username/repository" : 인 따옴표를 지우고 안에 있는 내용은 각자의 username과 repository name을 작성하는 구간입니다.

`$ git remote -v` : git repository 원격 상태 확인

`$ git remote rm origin` : origin이라는 remote 원격 경로 삭제

`$ git add .` : github에 올릴 작업물을 cache로 임시 저장.

`$ git status` : `git add .`로 cache로 등록한 파일 등 목록을 봅니다.

`$ git rm -r --cached .` : github에 push 하기 전 미리 올린 cache를 삭제.

`$ git commit -m "내용"` : "내용" 으로 github에 commit을 하여 저장.

`$ git branch -M main` : github에 push가 가능한 main으로 branch를 변경.

`$ git push -u origin main` : github에 최종으로 작업물을 올리는 작업.

`$ git push -f origin main` : github에 push한 기록을 아예 전부 덮어씌워 작업물을 올리는 작업. 위험하므로 자주 쓰이지 않게 하는게 요령.

🍭 github에 push한 결과물은 수정은 못하고 새로 덮어쓰기만 가능하니 주의할 것.

# 🍌 java & Spring .gitignore Setting

.gitignore의 저장 위치는 src가 있는 저장위치에 있어야 합니다.

VSCode 혹 IntelliJ에서 .gitignore 자동완성 기능으로 github에 올리지 않을 java, eclipse에 대한 파일, 폴더의 목록입니다.

추가로 .classpath, .project에 대한 내용을 추가했습니다.

```

### Java template

# Compiled class file

\*.class

# Log file

\*.log

# BlueJ files

\*.ctxt

# Mobile Tools for Java (J2ME)

.mtj.tmp/

# Package Files

_.jar
_.war
_.nar
_.ear
_.zip
_.tar.gz
\*.rar

# virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml

hs_err_pid*
replay_pid*

### Eclipse template ( add .classpath and .project )

.classpath
.project
.metadata
bin/
tmp/
_.tmp
_.bak
_.swp
_~.nib
local.properties
.settings/
.loadpath
.recommenders

# External tool builders

.externalToolBuilders/

# Locally stored "Eclipse launch configurations"

\*.launch

# PyDev specific (Python IDE for Eclipse)

\*.pydevproject

# CDT-specific (C/C++ Development Tooling)

.cproject

# CDT- autotools

.autotools

# Java annotation processor (APT)

.factorypath

# PDT-specific (PHP Development Tools)

.buildpath

# sbteclipse plugin

.target

# Tern plugin

.tern-project

# TeXlipse plugin

.texlipse

# STS (Spring Tool Suite)

.springBeans

# Code Recommenders

.recommenders/

# Annotation Processing

.apt_generated/
.apt_generated_test/

# Scala IDE specific (Scala & Java development for Eclipse)

.cache-main
.scala_dependencies
.worksheet

# Uncomment this line if you wish to ignore the project description file.
# Typically, this file would be tracked if it contains build/dependency configurations:
#.project

```

# 🍭 Java debug & error

`must meclare a named package because this compilation unit is associated to the named module 'Chapter1'` : Chapter1 Project 안에 module-info.java를 삭제하면 Error가 사라짐
