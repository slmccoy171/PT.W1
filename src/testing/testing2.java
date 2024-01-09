package testing;

public class testing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		for (int i = 1; i < 100; i += 2) {
		    counter++;
		    System.out.println(counter);
		}
		    
	}

}
//question 1 conditionals pt 1
if (age >= 18) {
    System.out.println("You are old enough to vote.");
} else {
    System.out.println("You are not old enough to vote.");
}
}



    
    
}

//question 3 conditionals pt 1
if (randomWord.length() >= 10) {
    System.out.println("That is a really long word!");
} else {
    System.out.println("Your word is not that long.");
}
}

//question 5 conditionals pt 1
if (num1 < myNumber) {
    System.out.println(num1 + " is smaller than my number, " + myNumber);
} else if (num1 > myNumber) {
    System.out.println(num1 + " is larger than my number, " + myNumber);
} else if (num1 == myNumber) {
    System.out.println(num1 + " is equal to my number, " + myNumber);
}
}
}

//question 9 conditionals pt 1
if (personOneAge > personTwoAge && personOneAge > personThreeAge) {
    System.out.println("Person one is the oldest.");
} else if (personTwoAge > personOneAge && personTwoAge > personThreeAge) {
    System.out.println("Person two is the oldest.");
} else if (personThreeAge > personOneAge && personThreeAge > personTwoAge) {
    System.out.println("Person three is the oldest.");
}
}
}


//question 7 conditionals pt 1
if (sundayTemp > mondayTemp && sundayTemp > tuesdayTemp) {
    System.out.println("Sunday");
    
} else if (mondayTemp > sundayTemp && mondayTemp > tuesdayTemp) {
    System.out.println("Monday");
    
} else {
    System.out.println("Tuesday");
}



int i = 1;                   
while (i <= 5) {            
    System.out.println(i);     
    i++;                       
}
System.out.println("Done!"); 



//question 11 conditionals pt 2
if ( (wins > losses) && isFall ) {
    System.out.println("It's looking good for your team to make the playoffs.");

} else if ( (wins > losses ) && !isFall ) {
    System.out.println("Your favorite team has promise, but it's too early to tell.");

} else {
    System.out.println("It's not looking too good.");
}

//question 13 conditionals pt 2
if ( num1 >= num2 ) {
    if ( num3 >= num4 ) {
        System.out.println("both statements are true");
    }
}
System.out.println("program ended");

}
}
//use the code below to answer question 13
if ( num1 >= num2 && num3 >= num4){
    System.out.println("both statements are true");
   }
  System.out.println("program ended");
  
//question 15 conditionals pt 2
  switch (monthNumber) {
  case (1) :
      System.out.println("January");
      break;
  case (2) :
      System.out.println("February");
      break;
  case (3) :
      System.out.println("March");
      break;
  case (4) :
      System.out.println("April");
      break;
  case (5) :
      System.out.println("May");
      break;
  case (6) :
      System.out.println("June");
      break;
  case (7) :
      System.out.println("July");
      break;    
  case (8) :
      System.out.println("August");
      break;
  case (9) :
      System.out.println("September");
      break;
  case (10) :
      System.out.println("October");
      break;
  case (11) :
      System.out.println("November");
      break;
  case (12) :
      System.out.println("December");
      break;
default:
      System.out.println("Invalid Month");
}

}
}

//question 17 conditionals pt 2

int days = -1; 
switch( month.toLowerCase() ) {
    case "january":
    case "march":
    case "may":
    case "july":
    case "august":
    case "october":
    case "december":
        days = 31;
        break;
    case "april":
    case "june":
    case "september":
    case "november":
        days = 30;
        break;
    case "february":
        days = 28;
        break;
}

//question 19 conditionals pt 2



//question 5 loops pt 1
for(int i = 1; i <= power; i++) {
  result *= base;
}
System.out.println(result);

}
}

//question 7 loops pt 1
if (userNumber >= 1 && userNumber <= 100) {
	int i = userNumber;
	while(i <= 100) {
	    System.out.println(i);
		i++;
	} 
} else {
	System.out.println("Your number was not between 1 and 100.");
}
}
}

int number = 5;
do {
  System.out.println(number);
  number--;
} while (number >= 1);
System.out.println("Blast off!");




//question 9 loops pt 1
for(int i=1; i<=10; i++) {
 System.out.println(num +" x " + i + " = " + (num*i) );
}


}
}

//question 11 loops pt 2
do {
    sumResult += numToAdd;
    howManyTimes--;
} while (howManyTimes > 0);

System.out.println(sumResult);


}
}

//question 13 loops pt 2
if (userNumber > 10 && userNumber < 100) {
    do {
        System.out.println(userNumber);
        userNumber--;
    } while (userNumber >= 10);
} else {
    System.out.println("Your number is not a value that is more than 10 and less than 100.");
}
    }
}


//question 15 loops pt 2

if (countDown <= 10 && countDown >= 3) {
    do {
        System.out.println(countDown + "... ");
        countDown--;
    } while (countDown >= 1);
    	System.out.println("We have lift off!");
} else {
    System.out.println("We have lift off!");
}
    }
}

//question 17 loops pt 2
int counter = wordLength;
		do {
		    System.out.println(userWord);
		    if ( wordLength < 5 ) {
		        break;
		    } 
		    counter--;
		} while ( counter > 0 );
		
	}
}

//question 19 loops pt 2

//WRITE YOUR CODE HERE 
for ( int i = 0; i < userWord.length(); i++ ) {
    longString += userWord;
}

System.out.println(longString);

}
}

//