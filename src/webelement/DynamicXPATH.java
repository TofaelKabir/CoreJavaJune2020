package webelement;

public class DynamicXPATH {
	
/*
 
Web site  contain web element
web element -- every particle of a web page
Front end -- What i see
Back end -- 
HTML -- stands for Hyper Text Mark up Language
CSS - Cascade styling sheet

There are 8 ways to locate web element -- called locator
one of the is XPATH


****  Please do HW by creating 4 independent element from each type described below  ****

Xpath:

1) Tag with single attribute.

//html tag [@attribute name = 'attribute value' ]
 
search field ---- //input[@id='twotabsearchtextbox']
submit button -- //input[@tabindex='20']
logo --- //span[@class='nav-sprite nav-logo-base']

2) Tag with multiple attribute with or logic

//html tag [@attribute name = 'attribute value' or @attribute name = 'attribute value']

search field ----- //input[@tabindex='19' or @id='twotabsearchtextbox']
 
3) Tag with multiple attribute with and logic
//html tag [@attribute name = 'attribute value' and @attribute name = 'attribute value']
 
submit button -- //input[@class='nav-input' and @value='Go']

4) Tag with inner text [means actual text]


//html tag [text() = 'inner text value' ]
customer service --- //a[text()='Customer Service']
best seller --- //a[text()='Best Sellers']


5) Tag with inner text [not actual text, means partial text as well as actual text]



//html tag [contains(text(), 'partial inner text value') ]
 
 // this one is used most as a text
  
 from staples: Products partial text:
 //span[contains(text(), 'Produc')]


6) Tag with attributes and contains
 

//html tag [contains(@attribute, 'attribute value') ]
 
 //from staples: Deals
 
 (//span[contains(@class, ' navigation-menu-item__primaryHeaderHeadliner')])[2]
 
  
  
7) Normalize space -- remove white space
//html tag [normalize-space(text())='attribute value']

//from Mount sinai: Find a doctor

(//a[normalize-space(text())='Find a Doctor'])[1]


8) Starts with text

//html tag [starts-with(text(), 'attribute value')]
 
//mount sinai --- Book an Appointment now with a Mount Sinai doctor.
 
(//p[starts-with(text(), 'Book')])[1]  
 
9) Starts with attribute

//html tag [starts-with(@attributes, 'attribute value']
 
//mount sinai ---request an appointment 
(//a[starts-with(@class, 'hidden-xs dropdown')])[6]


10) Tag with parents
//mount sinai ---Our locations

//a[@class='hidden-xs dropdown']//parent::li[@class='active open']

11) Tag with child
//mount sinai --- Allergy and Immunology
 //div[@class='menu-content']//child::ul//child::li//child::a[text()='Allergy and Immunology']

12)Tag with following sibling {younger brother}

//mount sinai -- our locations

(//a[@class='hidden-xs dropdown']//following-sibling::a[@class='visible-xs dropdown'])[1]

13) Tag with preceding sibling {elder brother}
no real example is given
(//a[@class='hidden-xs dropdown']//preceding-sibling::a[@class='visible-xs dropdown'])[1]


14) Tag with inner text (if multiple is present)

(//html tag [text() = 'inner text value' ])[index number]
 from mount sinai webite -- request an appointment --- (//a[@class='hidden-xs dropdown'])[3]
                            our locations -- (//a[@role='button'])[4]

 
 * */
	
	

}
