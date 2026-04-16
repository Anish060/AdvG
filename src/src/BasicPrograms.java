package src;
import java.util.*;
public class BasicPrograms {

    static void oddEven(int n) {
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }

    static void prime(int n) {
        boolean isPrime = n > 1;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) isPrime = false;
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }

    static void palindromeNumber(int n) {
        int temp = n, rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
    }

    static void armstrong(int n) {
        int temp = n, sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }
        System.out.println(temp == sum ? "Armstrong" : "Not Armstrong");
    }

    static void reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reversed: " + rev);
    }

    static void sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum: " + sum);
    }

    static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial: " + fact);
    }

    static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    static void reverseString(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);
        System.out.println(rev);
    }

    static void palindromeString(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
    }

    static void countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray())
            if ("aeiou".indexOf(c) != -1) count++;
        System.out.println(count);
    }

    static void largest(int[] arr) {
        int max = arr[0];
        for (int i : arr) if (i > max) max = i;
        System.out.println(max);
    }

    static void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
        System.out.println(Arrays.toString(arr));
    }

    static void linearSearch(int[] arr, int key) {
        for (int i : arr)
            if (i == key) {
                System.out.println("Found");
                return;
            }
        System.out.println("Not Found");
    }

    // ===== NEWLY ADDED METHODS =====

    // Count words
    static void countWords(String s) {
        String[] words = s.trim().split("\\s+");
        System.out.println(words.length);
    }

    // Remove spaces
    static void removeSpaces(String s) {
        System.out.println(s.replace(" ", ""));
    }

    // Character frequency
    static void charFrequency(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        for (int i = 0; i < 256; i++)
            if (freq[i] > 0)
                System.out.println((char) i + " : " + freq[i]);
    }

    // Anagram
    static void anagram(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b) ? "Anagram" : "Not Anagram");
    }

    // Strong number
    static void strong(int n) {
        int temp = n, sum = 0;
        while (n > 0) {
            int d = n % 10, f = 1;
            for (int i = 1; i <= d; i++) f *= i;
            sum += f;
            n /= 10;
        }
        System.out.println(sum == temp ? "Strong" : "Not Strong");
    }

    // Neon number
    static void neon(int n) {
        int sq = n * n, sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        System.out.println(sum == n ? "Neon" : "Not Neon");
    }

    // Largest digit
    static void largestDigit(int n) {
        int max = 0;
        while (n > 0) {
            max = Math.max(max, n % 10);
            n /= 10;
        }
        System.out.println(max);
    }

    // Smallest element
    static void smallest(int[] arr) {
        int min = arr[0];
        for (int i : arr) if (i < min) min = i;
        System.out.println(min);
    }

    // Second largest
    static void secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > first) {
                second = first;
                first = i;
            } else if (i > second && i != first)
                second = i;
        }
        System.out.println(second);
    }

    // Sum of array
    static void sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        System.out.println(sum);
    }

    // Swap numbers
    static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
        System.out.println(a + " " + b);
    }

    // Largest of 3
    static void largest3(int a, int b, int c) {
        System.out.println(Math.max(a, Math.max(b, c)));
    }

    // Calculator
    static void calculator(int a, int b, char op) {
        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': System.out.println(a / b); break;
        }
    }

    // Star pattern
    static void starPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // Number pattern
    static void numberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    // ===== MAIN =====
    public static void main(String[] args) {

        oddEven(5);
        prime(7);
        palindromeNumber(121);
        armstrong(153);
        reverseNumber(1234);
        sumDigits(123);
        factorial(5);
        fibonacci(5);

        reverseString("hello");
        palindromeString("madam");
        countVowels("hello");
        countWords("hello world java");
        removeSpaces("hello world");

        int[] arr = {5, 2, 9, 1};

        largest(arr);
        smallest(arr);
        secondLargest(arr);
        sumArray(arr);
        reverseArray(arr);
        bubbleSort(arr);
        linearSearch(arr, 9);

        strong(145);
        neon(9);
        largestDigit(9384);

        swap(2, 3);
        largest3(3, 7, 5);
        calculator(5, 2, '+');

        starPattern(4);
        numberPattern(4);
    }
}

/*
 QUESTION 
 Write down the steps involved in sonarcube installation,installation of sonarscanner 
CLI , configure sonarcube , setup sonarcube as a system service  
 
SonarCube Installation in Ubuntu  
Step-1:- Install the PostgreSQL if it's not installed on your Ubuntu 24.04 workstation. 
sudo apt install -y postgresql-common postgresql -y 
Step-2:- Enable the PostgreSQL database server to automatically start at boot. 
sudo systemctl enable postgresql 
Step-3:- Start the PostgreSQL database server. 
sudo systemctl start postgresql 
Step-4:- Log in to the PostgreSQL database server as the postgres user. 
sudo -u postgres psql 
Step-5:- Create a new sonaruser PostgreSQL role with a strong password to use with 
SonarQube. Replace your_password with your desired password. 
CREATE ROLE sonaruser WITH LOGIN ENCRYPTED PASSWORD 
'your_password'; 
Step-6:- Create a new sonarqube database. 
CREATE DATABASE sonarqube; 
Step-7:- Grant the sonaruser role full privileges to the sonarqube database. 
GRANT ALL PRIVILEGES ON DATABASE sonarqube TO sonaruser; 
Step-8:- Switch to the sonarqube database. 
\c sonarqube 
GRANT ALL PRIVILEGES ON SCHEMA public TO sonaruser; 
Step-9:- Exit the PostgreSQL database console. 
\q 
Install SonarQube 
SonarQube is not available in the default package repositories on Ubuntu 24.04 and requires 
OpenJDK 21 to run. Follow the steps below to download the latest SonarQube release file and 
install SonarQube. 
Step-1:- Update the server's APT package index. 
sudo apt update 
Step-2:- Install OpenJDK 17. 
sudo apt install openjdk-17-jdk -y 
Step-3:- Install Unzip to extract files from the SonarQube archive. 
sudo apt install unzip 
Step-4:- Verify the installed java version. 
java -version 
sudo wget 
https://binaries.sonarsource.com/Distribution/sonarqube/sonarqube-25.2.0.102705
.zip 
Step-5:- Extract files from the downloaded archive using Unzip. 
unzip sonarqube-25.2.0.102705.zip 
Step-6:- Move the extracted files to a systemwide directory such as /opt. 
sudo mv sonarqube-25.2.0.102705/ /opt/sonarqube 
Step-7:- Create a dedicated sonarqube system user without login privileges and a home 
directory. 
sudo adduser --system --no-create-home --group --disabled-login sonarqube 
Step-8:- Grant the sonarqube user full privileges to the /opt/sonarqube directory. 
sudo chown -R sonarqube:sonarqube /opt/sonarqube 
Install SonarScanner CLI 
SonarQube uses code scanners depending on the target programming language to scan and 
analyze code quality. SonarScanner CLI is the default scanner if no specific scanner is specified 
on your system. Follow the steps below to install the SonarScanner CLI to analyze code on your 
workstation. 
Step-1:- Visit the SonarScanner CLI page and verify the latest version to download. For 
example, run the following command to download the SonarScanner CLI version 7.0.1 
wget 
https://binaries.sonarsource.com/Distribution/sonar-scanner-cli/sonar-scanner-cli
7.0.1.4817-linux-x64.zip 
Step-2:- Extract files from the archive depending on the downloaded version. 
unzip sonar-scanner-cli-7.0.1.4817-linux-x64.zip 
Step-3:- Move the extracted directory to /opt/sonarscanner. 
sudo mv sonar-scanner-7.0.1.4817-linux-x64/  /opt/sonarscanner 
Step-4:- Open the sonar-scanner.properties configuration file. 
sudo nano /opt/sonarscanner/conf/sonar-scanner.properties 
Step-5:- Find the following sonar.host.url directive and change the default 
https://mycompany.com/sonarqube value to 127.0.0.1. 
sonar.host.url=127.0.0.1 
sudo chmod +x /opt/sonarscanner/bin/sonar-scanner 
Step-6:- Link the sonar-scanner binary to the /usr/local/bin directory to enable it as a 
system-wide command. 
sudo ln -s /opt/sonarscanner/bin/sonar-scanner /usr/local/bin/sonar-scanner 
Step-7:- View the installed SonarScanner version. 
sonar-scanner -v 
Your output should be similar to the one below. 
13:33:31.946 INFO  SonarScanner CLI 7.0.1.4817 
13:33:31.950 INFO  Java 17.0.13 Eclipse Adoptium (64-bit) 
13:33:31.951 INFO  Linux 6.8.0-51-generic amd64 
Configure SonarQube 
SonarQube requires specific configurations for optimal performance, including database 
connections, Java runtime options, system resource limits, and user permissions. Follow the 
steps below to configure SonarQube to run on your server. 
Step-1:- Open the main sonar.properties Sonarqube configuration file. 
sudo nano /opt/sonarqube/conf/sonar.properties 
Step-2:- Add the following configurations at the end of the file. Replace sonaruser and 
your_password with actual PostgreSQL database user details. 
sonar.jdbc.username=sonaruser 
sonar.jdbc.password=your_password 
sonar.jdbc.url=jdbc:postgresql://localhost:5432/sonarqube 
sonar.web.javaAdditionalOpts=-server 
sonar.web.host=0.0.0.0 
sonar.web.port=9000 
sudo nano /etc/sysctl.conf 
Step-3:- Add the following directives at the end of the file. 
vm.max_map_count=524288 
fs.file-max=131072 
sudo nano /etc/security/limits.d/99-sonarqube.conf 
Step-4:- Add the following directives to increase the file descriptor and process limits for 
SonarQube. 
sonarqube   -   nofile   131072 
sonarqube   -   nproc    8192 
sudo ufw allow 9000/tcp 
● Run the following command to install UFW and allow SSH connections if it's unavailable. 
sudo apt install ufw -y && sudo ufw allow 22/tcp 
Step-5:- Reload UFW to apply the firewall configurations. 
sudo ufw reload 
Step-6:- View the UFW status and verify that below are the only active firewall rules. 
sudo ufw status 
Your output should be similar to the one below: 
Status: active 
To                         --                         
22/tcp                     
9000/tcp                   
22/tcp (v6)                
Action      ------      
From ---- 
ALLOW       Anywhere 
ALLOW       Anywhere 
ALLOW       Anywhere (v6) 
1. 9000/tcp (v6)              
ALLOW       Anywhere (v6) 
Set Up SonarQube as a System Service 
Follow the steps below to set up a new system service for SonarQube to manage the 
application processes on your server. 
Step-1:- Create a new sonarqube.service file. 
sudo nano /etc/systemd/system/sonarqube.service 
Step-2:- Add the following configurations to the file. 
[Unit] 
Description=SonarQube service 
After=syslog.target network.target 
[Service] 
Type=forking 
ExecStart=/opt/sonarqube/bin/linux-x86-64/sonar.sh start 
ExecStop=/opt/sonarqube/bin/linux-x86-64/sonar.sh stop 
User=sonarqube 
Group=sonarqube 
PermissionsStartOnly=true 
Restart=always 
StandardOutput=syslog 
LimitNOFILE=131072 
LimitNPROC=8192 
TimeoutStartSec=5 
SuccessExitStatus=143 
[Install] 
WantedBy=multi-user.target 
sudo systemctl daemon-reload 
Step-3:- Enable SonarQube to start at boot. 
sudo systemctl enable sonarqube 
Step-4:-Start the SonarQube service. 
sudo systemctl start sonarqube 
Step-5:- View the SonarQube service status and verify that it's running. 
sudo systemctl status sonarqube 
sudo reboot now

s */





/*
 QUESTION:
(A).Write down the steps involved in installing docker on windows
Steps involved in installing Docker on Windows:
1. Open the website https://docs.docker.com/docker-for-windows/install
2. Download the latest version of Docker and install it.
3. To execute Docker commands in Windows
(i) open PowerShell 
(ii) run the docker commands.
Docker for Windows can be installed only on Windows 10 Professional 64 bit
(or)
Windows 2016 Server edition.
(B).Write the docker commands for the following
1. To see the list of docker images in our machine
>> docker images
(or)
>> docker image ls
2. To download an image from docker hub
>> docker pull image-name
3. To upload an image into dockerhub
>> docker push image-name
4. To search for an images on docker hub
>> docker search image-name
5. To delete an image on docker host
>> docker rmi image-name
6. To create an image from a container
>> docker commit container-name/container-id image-name
7. To create an image from a dockerfile
>> docker build -t imagename .
8. To see the list of running containers
>> docker container ls
9. To see the list of stopped and running containers
>> docker ps -a
10. To start a container
>> docker start container-name/container-id
11. To stop a container
>> docker stop container-name/container-id
12. To restart a container
>> docker restart container-name/container-id
13. To remove a stopped container
>> docker rm container-name/container-id
14. To remove a running container
>> docker rm -f container-name/container-id
15. To stop all the running containers
>> docker stop $(docker ps -aq)
16. To see the logs generated by the container
>> docker logs container-name/container-id
17. To see the ports of a container
>> docker port container-name/container-id
18. To find detailed info about a container
>> docker inspect container-name/container-id
19. Creating a docker container
>> docker run image-name
20. To inspect a network
>> docker network inspect network-id/network-name
 */






/*
 Installing Docker on windows
1.open https://docs.docker.com/docker-for-windows/install
2.Download the latest version and install it.
3.To execute docker commands in windows
 -->open powershell (in windows like dos)
 -->run the docker commands
Note:
Docker for windows can be installed only on windows10 prof x24 bit
 (or)
 windows 2016 server edition
Docker images
an image is a collection of bin/lib(binaries/libraries)that are necessary for an application
Docker Container
-->a running instance of an image is called as a container
--> any number of containers can be created from one image
-->initially all the docker images are present in the cloudsite of docker(hub.docker.com)
Docker Client
--> this is the application where we can fire the docker commands.the Linux terminal will act as a
docker client
--> the docker client will take the commands and send them to a background process called
dockerdaemon.
DockerDaemon
This is a background process of docker which runs in the dockerdaemon
and it will accept the commands coming from dockerclient and send them to docker images (oR)
containers (or) the docker registry.
Docker Registry
docker registry is the cloud site of docker where all the docker images are present.
this is two types
 1.public
 2.private
1.public Registery
 public Registery is hub.docker.com and anyone can download images from this site.
2.private Registery
 private Registery is maintained by individual organizations and only the organization team members
can access these images.
The machine where docker is installed and where all the containers are running is called "Docker
Host".
Important Docker commands
Working on dockerImages
1. To see the list of docker images in our machine(DockerHost)
 >>docker images
 (or)
 >> docker image ls
2. To download an image from docker hub

 >> docker pull image-name
3.To upload an image into dockerhub
>> docker push image-name
4. To search for an images on docker hub
 >> docker search image-name
5. To delete an image on docker host
>> docker rmi image-name
6. To create an image from a container
>> docker commit container-name/container-id image-name
7. To create an image from a dockerfile
 >> docker build -t imagename .
Note
 . represents current working directory
Working on docker containers
8.To see the list of running containers
>> docker container ls
9.To see the list of stopped and running containers
>> docker ps -a
10. To start a container
>> docker start container-name/container-id
11. To stop a container
>> docker stop container-name/container-id
12. To restart a container
>> docker restart container-name/container-id
 To restart a container after 10 seconds
>> docker restart -t 10 container-name/container-id
13. To remove a stopped container
>> docker rm container-name/container-id
14. To remove a running container
>> docker rm -f container-name/container-id
15. To stop all the running containers
>>docker stop $(docker ps -aq)
16. To remove all the stopped containers
>>docker rm $(docker ps -aq)
17. To remove all the running containers
>>docker rm $(docker ps -aq)
18. To see the logs generated by the container
>> docker logs container-name/container-id
19. To see the ports of a container
>> docker port container-name/container-id
20. To find detailed info about a container
>> docker inspect container-name/container-id
21.creating a docker container
>> docker run image-name
22.To see the list of docker networking
>>docker network ls
23.To inspect a network
>> docker network inspect network-id/network-name
24.To create a network
>> docker network create network-name
25.To delete a network
>> docker network rm create network-id/network-name
 */
