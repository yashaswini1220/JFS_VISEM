function showInventor() {
    const inventor = document.getElementById("inventorList").value;

    const data = {
        gosling: {
            img: "c:\Users\yasha\AppData\Local\Temp\bb2c4dd9-598d-4702-b446-c48d192f8838_images.rar.838\images\eich.jpg",
            info: "James Gosling is the creator of Java, developed at Sun Microsystems in 1995."
        },
        rossum: {
            img: "c:\Users\yasha\AppData\Local\Temp\bf500ed5-4c20-4c62-aea0-282576498d45_images.rar.d45\images\gosling.jpg",
            info: "Guido van Rossum created Python in 1991 and is known as the 'Benevolent Dictator For Life' of Python."
        },
        ritchie: {
            img: "c:\Users\yasha\AppData\Local\Temp\883deb21-e10a-4079-ba3c-d296940ddf55_images.rar.f55\images\hejlsberg.jpg",
            info: "Dennis Ritchie created the C programming language at Bell Labs in 1972."
        },
        stroustrup: {
            img: "c:\Users\yasha\AppData\Local\Temp\55a27eaa-1095-46ec-bddc-543f68c9bb04_images.rar.b04\images\hopper.jpg",
            info: "Bjarne Stroustrup developed C++ as an extension of C beginning in 1979."
        },
        eich: {
            img: "c:\Users\yasha\AppData\Local\Temp\13d467a2-285a-4f18-b988-f18afdb4efed_images.rar.fed\images\lerdorf.JPG",
            info: "Brendan Eich created JavaScript in 1995 while working at Netscape."
        },
        lerdorf: {
            img: "c:\Users\yasha\AppData\Local\Temp\21592d57-d01b-4beb-867d-b95dac2e2197_images.rar.197\images\matsumoto.jpg",
            info: "Rasmus Lerdorf created PHP in 1994 originally as CGI scripts."
        },
        matsumoto: {
            img: "c:\Users\yasha\AppData\Local\Temp\3dfd3cbf-5e0a-475c-b815-efabec0782d5_images.rar.2d5\images\mccarthy.jpg",
            info: "Yukihiro 'Matz' Matsumoto created Ruby in 1995 focusing on simplicity and productivity."
        },
        hejlsberg: {
            img: "c:\Users\yasha\AppData\Local\Temp\ac76e553-754b-40db-8bf2-80d95d778650_images.rar.650\images\ritchie.jpg",
            info: "Anders Hejlsberg developed C# for Microsoft in 2000."
        },
        hopper: {
            img: "c:\Users\yasha\AppData\Local\Temp\875854b7-d5d2-406a-980e-fa20e3a3cc76_images.rar.c76\images\rossum.jpg",
            info: "Grace Hopper created COBOL and pioneered compiler technology."
        },
        mccarthy: {
            img: "c:\Users\yasha\AppData\Local\Temp\eeaaaf5e-bc4e-4b3f-8440-9dbe55e264e2_images.rar.4e2\images\stroustrup.jpg",
            info: "John McCarthy created Lisp in 1958 and is considered one of the founders of AI."
        }
    };

    if (inventor === "") {
        document.getElementById("inventorImage").src = "";
        document.getElementById("infoBox").innerText = "Select an inventor to view details";
    } else {
        document.getElementById("inventorImage").src = data[inventor].img;
        document.getElementById("infoBox").innerText = data[inventor].info;
    }
}
