#clone project
1.git clone https://github.com/phuwalit6609650590/cs261.git

**cd เข้าไปใน Folder cs261-frontend**
#bulid and run frontend
1.docker build -f DockerContainer_NodeJS.dockerfile -t node-js-image .
2.docker run -p 3000:3000 node-js-image

**cd เข้าไปใน Folder SetupDocker 
#build Container สำหรับ DataBase
1..docker network create mynetwork
2.docker build -f DockerContainer_MS_SQL.dockerfile -t my-mssql-image . 
3.docker run -d --name sql-server --network mynetwork -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=YourStrong@Passw0rd" -p 1433:1433 my-mssql-image
4.login SSMS ด้วย user=sa,password=YourStrong@Passw0rd**
5.สร้างDataBaseใหม่ ชื่อmyDB

#open CURD folder
**ถ้าใช้ intelliJ IDEA ให้กด open folder ในแอพแล้วก็กดเข้าCURDแล้วเลือกCURD (ชื่อซ้ำกัน)
1.กดรันCrudApplication เพื่อเปิดใช้งาน backend ไว้จัดการกับ frontend และ DataBase ก่อน
ทดลองlogin
