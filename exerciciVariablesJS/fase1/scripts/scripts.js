function imprimir(){
    
    //fase 1
    document.write("FASE 1" + "</br>");
    var name = "Eloi";
    var lastName1 = "Fdez";
    var lastName2 = "Molina";
    var day = 29;
    var month = 1;
    var year = 1992;

    var sum1 = lastName1 + " " + lastName2 +  ", " + name;
    var sum2 = day + "/" + month + "/" + year;

    document.write(sum1+"</br>" + sum2 + "</br>");

    //fase 2
    document.write("FASE 2" + "</br>");
    const YEAR_BASE = 1948;
	var leapYear = 0;
		
    for (var i = YEAR_BASE; i < year; i++) {
        if(((i%400) == 0) || ((i%4) == 0) && (i%100 != 0)) {
            leapYear++;
        }
    }

    document.write("Hi ha un total de " + leapYear + " anys de traspas" + "</br>");

    //fase 3
    document.write("FASE 3" + "</br>");
    var isLeap = false;
		
    for (var i = YEAR_BASE; i <= year; i++) {
        if(((i%400) == 0) || ((i%4) == 0) && (i%100 != 0)) {
            document.write(i + "</br>");
        }
    }
    
    if(((year%400) == 0) || ((year%4) == 0) && (year%100 != 0)) {
        isLeap = true;
    }
    
    if(isLeap) {
        document.write("l'any "+ year + " és un any de traspàs!" + "</br>");
    }else {
        document.write("l'any "+ year + " no és un any de traspàs" + "</br>");
    }
    
    //fase 4
    document.write("FASE 4" + "</br>");
    var sumName = name + " " + lastName1 + " " + lastName2;
    var sumYear = day + "/" + month + "/" + year;
    
    document.write(sumName + "</br>");
    document.write(sumYear + "</br>");
    
    if(isLeap) {
       document.write("El meu any és de traspàs!");
    }else {
        document.write("El meu any no és de traspàs");
    }
}