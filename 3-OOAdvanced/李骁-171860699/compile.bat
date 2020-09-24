echo "begein delete *.class..."
del .\*.class /s
echo "delete *.class successfully"
echo "begin compile..."

javac -encoding utf-8 -d . MyComparable.java
javac -encoding utf-8 -d . SortAlgorithm.java
javac -encoding utf-8 -d . Huluwa.java
javac -encoding utf-8 -d . Dawa.java
javac -encoding utf-8 -d . Erwa.java
javac -encoding utf-8 -d . Sanwa.java
javac -encoding utf-8 -d . Siwa.java
javac -encoding utf-8 -d . Wuwa.java
javac -encoding utf-8 -d . Liuwa.java
javac -encoding utf-8 -d . Qiwa.java
javac -encoding utf-8 -d . Grandfather.java
javac -encoding utf-8 -d . SortHuluwa.java

echo "execute main()..."
java lixiao.sorthuluwa.SortHuluwa
echo "execute finish"