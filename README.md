Voice Synthesizer 
Desciption
-----------
Aim of this project is to facilitate the use of the FreeTTS library. 
I created this project at the moment when I needed FreeTTS library use.
It quickly became clear that its use is not the most convenient.
Project Voice Synthesizer allowing to quickly synthesize provided text snippet with one of chosen
voices.
Currently available voices:
Standard voices:
- alan
- kevin
- kevin16
Mbrola voices:
- mbrola_us1
- mbrola_us2
- mbrola_us3
Mbrola voices are available only when you provide valid 'mbrola_base'. 
Mbrola folder is in resources directory of the project righ now.

Installation
-------------
This is Maven project. After you clone it, you need to use maven commands to build it.
mvn clean install

Youc can try API by using main class of the project which is a basic example.
