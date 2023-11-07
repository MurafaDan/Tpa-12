//1Creați o clasă Employee și alte două clase care o vor extinde - Manger și Programmer.
// Definiți câteva variabile de instanță, metode getter/setter și un constructor.
// Ulterior creați o interfață care va permite programatorului cât și managerului să facă attendTraining,
// și o altă interfață care va permite doar managerului să facă conductInterview. Testați clasele create într-o clasă executabilă.
//
//  2.	Creați o clasă MeetingRoom care va primi ca argument la constructor o listă de obiecte
// de tipul interfeței care furnizează comportamentul attendTraining (interfața creată în exercițiul #1).
//  Adăugați o metodă în cadrul clasei MeetingRoom în care veți invoca iterativ metoda attendTraining pe
//  fiecare obiect din cadrul listei. Testați aplicația într-o clasă executabilă și observați comportamentul polimorfic bazat pe interfețe.
//
// 3.	Creați o listă de obiecte Employee. Utilizând operatorul instanceof și operatorul de casting,
// nvocați iterativ metode specifice tipului obiectului (faceți posibilă apelarea metodelor attendTraining
// și conductInterview definite pe interfețele din exercițiul #1).

public class Main {
    public static void main(String[] args) {
        Training training1 = new Programmer("Dan",20);
        Training training2 = new Manager("Madalina", 19);
        Training training3 = new Manager("Liviu",19);

        MeetingRoom meetingRoom = new MeetingRoom();
        meetingRoom.join(new Training[]{training1,training2,training3});

        Interview interview1 = new Manager("Bogdan",20);
        interview1.conductInterview();

    }
}