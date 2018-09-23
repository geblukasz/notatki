package com.company.zad18;

/*
*
* Wyobraź sobie, że mamy klasę Tshirt,
* która posiada kilka atrybutów takich jak kolor, rozmiar czy producent.
* O ile producentów koszulek, podobnie jak ich
* kolorów jest dość dużo to rozmiary są już
* bardzo często wspólne dla różnych producentów.
* Rozmiary możemy wyliczyć: S, M, L czy XL.
* I właśnie do przechowywania danych tego typu
* Java ma specjalny typ.
* Jest to enum zwany także typem wyliczeniowym.
* Przejdźmy od razu do przykładu:
*
*
* */
public class Tshirt {

    private TshirtSize size;
    private String manufacturer;

    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(TshirtSize.L, "Polex");
        System.out.println(tshirt.size);
    }
/*
*
* Jak widzisz w przykładzie wyżej mamy klasę Tshirt,
 * reprezentującą koszulkę, która jako jeden
 * z atrybutów ma właśnie rozmiar, który jest typu TshirtSize.

Do wartości typu wyliczeniowego odnosimy
się jak do pól statycznych klasy, zatem
w naszym przypadku do rozmiaru L możemy
 odwołać się jako TshirtSize.L.
 Dzieję się tak ponieważ w rzeczywistości
 wartości typu wyliczeniowego mają
automatycznie dodane modyfikatory public static final.
*
* */
}
