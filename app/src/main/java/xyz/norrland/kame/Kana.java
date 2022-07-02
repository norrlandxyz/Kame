package xyz.norrland.kame;

public class Kana extends Question {
    //There are 46 hiragana with 3 variants each (138 characters total).

    public Kana(String kana_type, String kana_sound) {

        //if hiragana type, should be changed into "switch" for performance reasons
        if (kana_type.equals("hiragana")) {
            //r row
            switch (kana_sound) {
                case "ra":
                    this.question = "ら";
                    this.correctAnswer = "ra";
                    break;
                case "ri":
                    this.question = "り";
                    this.correctAnswer = "ri";
                    break;
                case "ru":
                    this.question = "る";
                    this.correctAnswer = "ru";
                    break;
                case "re":
                    this.question = "れ";
                    this.correctAnswer = "re";
                    break;
                //ro
                case "ro":
                    this.question = "ろ";
                    this.correctAnswer = "ro";
                    break;
                //y row
                case "ya":
                    this.question = "や";
                    this.correctAnswer = "ya";
                    break;
                case "yu":
                    this.question = "ゆ";
                    this.correctAnswer = "yu";
                    break;
                //yo
                case "yo":
                    this.question = "よ";
                    this.correctAnswer = "yo";
                    break;
                //m row
                case "ma":
                    this.question = "ま";
                    this.correctAnswer = "ma";
                    break;
                case "mi":
                    this.question = "み";
                    this.correctAnswer = "mi";
                    break;
                case "mu":
                    this.question = "む";
                    this.correctAnswer = "mu";
                    break;
                case "me":
                    this.question = "め";
                    this.correctAnswer = "me";
                    break;
                case "mo":
                    this.question = "も";
                    this.correctAnswer = "mo";
                    break;
                //h row, except fu
                case "ha":
                    this.question = "は";
                    this.correctAnswer = "ha";
                    break;
                case "hi":
                    this.question = "ひ";
                    this.correctAnswer = "hi";
                    break;
                case "he":
                    this.question = "へ";
                    this.correctAnswer = "he";
                    break;
                //ho
                case "ho":
                    this.question = "ほ";
                    this.correctAnswer = "ho";
                    break;
                //n row
                case "na":
                    this.question = "な";
                    this.correctAnswer = "na";
                    break;
                case "ni":
                    this.question = "に";
                    this.correctAnswer = "ni";
                    break;
                case "nu":
                    this.question = "ぬ";
                    this.correctAnswer = "nu";
                    break;
                case "ne":
                    this.question = "ね";
                    this.correctAnswer = "ne";
                    break;
                //n
                case "n":
                    this.question = "ん";
                    this.correctAnswer = "n";
                    break;
                //no
                case "no":
                    this.question = "の";
                    this.correctAnswer = "no";
                    break;
                //t row, except chi
                case "ta":
                    this.question = "た";
                    this.correctAnswer = "ta";
                    break;
                case "tsu":
                    this.question = "つ";
                    this.correctAnswer = "tsu";
                    break;
                case "te":
                    this.question = "て";
                    this.correctAnswer = "te";
                    break;
                //to
                case "to":
                    this.question = "と";
                    this.correctAnswer = "to";
                    break;
                //s row
                case "sa":
                    this.question = "さ";
                    this.correctAnswer = "sa";
                    break;
                case "shi":
                    this.question = "し";
                    this.correctAnswer = "shi";
                    break;
                case "su":
                    this.question = "す";
                    this.correctAnswer = "su";
                    break;
                case "se":
                    this.question = "せ";
                    this.correctAnswer = "se";
                    break;
                //so
                case "so":
                    this.question = "そ";
                    this.correctAnswer = "so";
                    break;
                //k row
                case "ka":
                    this.question = "か";
                    this.correctAnswer = "ka";
                    break;
                case "ki":
                    this.question = "き";
                    this.correctAnswer = "ki";
                    break;
                case "ku":
                    this.question = "く";
                    this.correctAnswer = "ku";
                    break;
                case "ke":
                    this.question = "け";
                    this.correctAnswer = "ke";
                    break;
                //ko
                case "ko":
                    this.question = "こ";
                    this.correctAnswer = "ko";
                    break;
                //from h row, starts differently
                case "fu":
                    this.question = "ふ";
                    this.correctAnswer = "fu";
                    break;
                //from t row, starts differently
                case "chi":
                    this.question = "ち";
                    this.correctAnswer = "chi";
                    break;
                //a row, all starts differently
                case "a":
                    this.question = "あ";
                    this.correctAnswer = "a";
                    break;
                case "i":
                    this.question = "い";
                    this.correctAnswer = "i";
                    break;
                case "u":
                    this.question = "う";
                    this.correctAnswer = "u";
                    break;
                case "e":
                    this.question = "え";
                    this.correctAnswer = "e";
                    break;
                case "o":
                    this.question = "お";
                    this.correctAnswer = "o";
                    break;
                //Row of w
                case "wa":
                    this.question = "わ";
                    this.correctAnswer = "wa";
                    break;
                case "wo":
                    this.question = "を";
                    this.correctAnswer = "wo";
                    break;
            }

        }
        //if symbol is of type katakana
        else if (kana_type.equals("katakana")) {
            //r row
            switch (kana_sound) {
                case "ra":
                    this.question = "ラ";
                    this.correctAnswer = "ra";
                    break;
                case "ri":
                    this.question = "リ";
                    this.correctAnswer = "ri";
                    break;
                case "ru":
                    this.question = "ル";
                    this.correctAnswer = "ru";
                    break;
                case "re":
                    this.question = "レ";
                    this.correctAnswer = "re";
                    break;
                //ro
                case "ro":
                    this.question = "ロ";
                    this.correctAnswer = "ro";
                    break;
                //y row
                case "ya":
                    this.question = "ヤ";
                    this.correctAnswer = "ya";
                    break;
                case "yu":
                    this.question = "ユ";
                    this.correctAnswer = "yu";
                    break;
                //yo
                case "yo":
                    this.question = "ヨ";
                    this.correctAnswer = "yo";
                    break;
                //m row
                case "ma":
                    this.question = "マ";
                    this.correctAnswer = "ma";
                    break;
                case "mi":
                    this.question = "ミ";
                    this.correctAnswer = "mi";
                    break;
                case "mu":
                    this.question = "ム";
                    this.correctAnswer = "mu";
                    break;
                case "me":
                    this.question = "メ";
                    this.correctAnswer = "me";
                    break;
                case "mo":
                    this.question = "モ";
                    this.correctAnswer = "mo";
                    break;
                //h row, except fu
                case "ha":
                    this.question = "ハ";
                    this.correctAnswer = "ha";
                    break;
                case "hi":
                    this.question = "ヒ";
                    this.correctAnswer = "hi";
                    break;
                case "he":
                    this.question = "ヘ";
                    this.correctAnswer = "he";
                    break;
                //ho
                case "ho":
                    this.question = "ホ";
                    this.correctAnswer = "ho";
                    break;
                //n row
                case "na":
                    this.question = "ナ";
                    this.correctAnswer = "na";
                    break;
                case "ni":
                    this.question = "ニ";
                    this.correctAnswer = "ni";
                    break;
                case "nu":
                    this.question = "ヌ";
                    this.correctAnswer = "nu";
                    break;
                case "ne":
                    this.question = "ネ";
                    this.correctAnswer = "ne";
                    break;
                //n
                case "n":
                    this.question = "ン";
                    this.correctAnswer = "n";
                    break;
                //no
                case "no":
                    this.question = "ノ";
                    this.correctAnswer = "no";
                    break;
                //t row, except chi
                case "ta":
                    this.question = "タ";
                    this.correctAnswer = "ta";
                    break;
                case "tsu":
                    this.question = "ツ";
                    this.correctAnswer = "tsu";
                    break;
                case "te":
                    this.question = "テ";
                    this.correctAnswer = "te";
                    break;
                //to
                case "to":
                    this.question = "ト";
                    this.correctAnswer = "to";
                    break;
                //s row
                case "sa":
                    this.question = "サ";
                    this.correctAnswer = "sa";
                    break;
                case "shi":
                    this.question = "シ";
                    this.correctAnswer = "shi";
                    break;
                case "su":
                    this.question = "ス";
                    this.correctAnswer = "su";
                    break;
                case "se":
                    this.question = "セ";
                    this.correctAnswer = "se";
                    break;
                //so
                case "so":
                    this.question = "ソ";
                    this.correctAnswer = "so";
                    break;
                //k row
                case "ka":
                    this.question = "カ";
                    this.correctAnswer = "ka";
                    break;
                case "ki":
                    this.question = "キ";
                    this.correctAnswer = "ki";
                    break;
                case "ku":
                    this.question = "ク";
                    this.correctAnswer = "ku";
                    break;
                case "ke":
                    this.question = "ケ";
                    this.correctAnswer = "ke";
                    break;
                //ko
                case "ko":
                    this.question = "コ";
                    this.correctAnswer = "ko";
                    break;
                //from h row, starts differently
                case "fu":
                    this.question = "フ";
                    this.correctAnswer = "fu";
                    break;
                //from t row, starts differently
                case "chi":
                    this.question = "チ";
                    this.correctAnswer = "chi";
                    break;
                //a row, all starts differently
                case "a":
                    this.question = "ア";
                    this.correctAnswer = "a";
                    break;
                case "i":
                    this.question = "イ";
                    this.correctAnswer = "i";
                    break;
                case "u":
                    this.question = "ウ";
                    this.correctAnswer = "u";
                    break;
                case "e":
                    this.question = "エ";
                    this.correctAnswer = "e";
                    break;
                case "o":
                    this.question = "オ";
                    this.correctAnswer = "o";
                    break;
                //Row of w
                case "wa":
                    this.question = "ワ";
                    this.correctAnswer = "wa";
                    break;
                case "wo":
                    this.question = "ヲ";
                    this.correctAnswer = "wo";
                    break;
            }

        }
    }
    //If handakuten or dakuten symbol should be used
    public Kana(String kana_type, String kana_sound, String dakuten_handakuten) {
        if (kana_type.equals("hiragana")) {
            if (dakuten_handakuten.equals("dakuten")) {
                //r row
                switch (kana_sound) {
                    //h row, except fu
                    //ho
                    case "bo":
                        this.question = "ぼ";
                        this.correctAnswer = "ho";
                        break;
                    //no
                    case "no":
                        this.question = "の";
                        this.correctAnswer = "no";
                        break;
                    //t row, except chi
                    case "ta":
                        this.question = "た";
                        this.correctAnswer = "ta";
                        break;
                    case "tsu":
                        this.question = "つ";
                        this.correctAnswer = "tsu";
                        break;
                    case "te":
                        this.question = "て";
                        this.correctAnswer = "te";
                        break;
                    //to
                    case "to":
                        this.question = "と";
                        this.correctAnswer = "to";
                        break;
                    //s row
                    case "sa":
                        this.question = "さ";
                        this.correctAnswer = "sa";
                        break;
                    case "shi":
                        this.question = "し";
                        this.correctAnswer = "shi";
                        break;
                    case "su":
                        this.question = "す";
                        this.correctAnswer = "su";
                        break;
                    case "se":
                        this.question = "せ";
                        this.correctAnswer = "se";
                        break;
                    //so
                    case "so":
                        this.question = "そ";
                        this.correctAnswer = "so";
                        break;
                    //k row
                    case "ka":
                        this.question = "か";
                        this.correctAnswer = "ka";
                        break;
                    case "ki":
                        this.question = "き";
                        this.correctAnswer = "ki";
                        break;
                    case "ku":
                        this.question = "く";
                        this.correctAnswer = "ku";
                        break;
                    case "ke":
                        this.question = "け";
                        this.correctAnswer = "ke";
                        break;
                    //ko
                    case "ko":
                        this.question = "こ";
                        this.correctAnswer = "ko";
                        break;
                    //from h row, starts differently
                    case "fu":
                        this.question = "ふ";
                        this.correctAnswer = "fu";
                        break;
                    //from t row, starts differently
                    case "chi":
                        this.question = "ち";
                        this.correctAnswer = "chi";
                        break;
                    //a row, all starts differently
                    case "a":
                        this.question = "あ";
                        this.correctAnswer = "a";
                        break;
                    case "i":
                        this.question = "い";
                        this.correctAnswer = "i";
                        break;
                    case "u":
                        this.question = "う";
                        this.correctAnswer = "u";
                        break;
                    case "e":
                        this.question = "え";
                        this.correctAnswer = "e";
                        break;
                    case "o":
                        this.question = "お";
                        this.correctAnswer = "o";
                        break;
                    //Row of w
                    case "wa":
                        this.question = "わ";
                        this.correctAnswer = "wa";
                        break;
                    case "wo":
                        this.question = "を";
                        this.correctAnswer = "wo";
                        break;
                }

            }

        }
        }
    }

