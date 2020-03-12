package sg.edu.rp.pd.braillent;

public class QuestionsLibrary {

    private String categoryList[] = {
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Alphabet",
            "Number",
            "Number",
            "Number",
            "Number",
            "Number",
            "Number",
            "Number",
            "Number",
            "Number",
            "Number",
            "Punctuation",
            "Punctuation",
            "Punctuation",
            "Punctuation",
            "Punctuation",
            "Punctuation",
            "Punctuation",
            "Punctuation",
            "Punctuation",
            "Punctuation",
            "Punctuation",
            "Punctuation"
    };

    private String imageList[] = {
            "braille_quiz_a_1",
            "braille_quiz_b_2",
            "braille_quiz_c_3",
            "braille_quiz_d_4",
            "braille_quiz_e_5",
            "braille_quiz_f_6",
            "braille_quiz_g_7",
            "braille_quiz_h_8",
            "braille_quiz_i_9",
            "braille_quiz_j_0",
            "braille_quiz_k",
            "braille_quiz_l",
            "braille_quiz_m",
            "braille_quiz_n",
            "braille_quiz_o",
            "braille_quiz_p",
            "braille_quiz_q",
            "braille_quiz_r",
            "braille_quiz_s",
            "braille_quiz_t",
            "braille_quiz_u",
            "braille_quiz_v",
            "braille_quiz_w",
            "braille_quiz_x",
            "braille_quiz_y",
            "braille_quiz_z",
            "braille_quiz_a_1",
            "braille_quiz_b_2",
            "braille_quiz_c_3",
            "braille_quiz_d_4",
            "braille_quiz_e_5",
            "braille_quiz_f_6",
            "braille_quiz_g_7",
            "braille_quiz_h_8",
            "braille_quiz_i_9",
            "braille_quiz_j_0",
            "braille_quiz_comma",
            "braille_quiz_semicolon",
            "braille_quiz_apostrophe",
            "braille_quiz_colon",
            "braille_quiz_hyphen",
            "braille_quiz_decimal",
            "braille_quiz_fullstop",
            "braille_quiz_exclamation",
            "braille_quiz_openquote_questionmark",
            "braille_quiz_openquote_questionmark",
            "braille_quiz_closequote",
            "braille_quiz_slash",
    };


    private String choiceList[][] = {
            {"A", "Z", "F", "G"}, // A
            {"E", "J", "B", "L"}, // B
            {"B", "I", "C", "L"}, // C
            {"M", "D", "O", "P"}, // D
            {"E", "U", "C", "D"}, // E
            {"E", "F", "G", "X"}, // F
            {"I", "J", "G", "Y"}, // G
            {"M", "H", "O", "Z"}, // H
            {"I", "K", "R", "D"}, // I
            {"J", "F", "R", "H"}, // J
            {"I", "K", "V", "L"}, // K
            {"M", "V", "Q", "L"}, // L
            {"A", "Q", "M", "D"}, // M
            {"E", "N", "G", "W"}, // N
            {"I", "J", "O", "L"}, // O
            {"M", "N", "P", "Z"}, // P
            {"Q", "E", "S", "D"}, // Q
            {"E", "R", "D", "H"}, // R
            {"S", "J", "F", "L"}, // S
            {"G", "N", "O", "T"}, // T
            {"E", "S", "N", "U"}, // U
            {"C", "F", "V", "H"}, // V
            {"I", "W", "K", "N"}, // W
            {"M", "X", "O", "P"}, // X
            {"A", "B", "M", "Y"}, // Y
            {"C", "F", "Q", "Z"}, // Z
            {"1", "3", "5", "7"}, // 1
            {"7", "4", "2", "1"}, // 2
            {"3", "2", "4", "8"}, // 3
            {"1", "2", "4", "9"}, // 4
            {"3", "5", "7", "8"}, // 5
            {"1", "2", "6", "7"}, // 6
            {"3", "4", "6", "7"}, // 7
            {"5", "8", "9", "0"}, // 8
            {"0", "2", "6", "9"}, // 9
            {"5", "6", "8", "0"}, // 0
            {"-", ",", "/", "”"}, // ,
            {":", "-", ",", ";"}, // ;
            {"/", ".", ";", "’"}, // '
            {":", ";", ",", "!"}, // :
            {"!", "-", "/", "?"}, // -
            {"/", "!", "?", "."}, // .
            {"-", ".", ":", "!"}, // .
            {".", "!", "/", "?"}, // !
            {"!", "/", "-", "?"}, // ?
            {"“", "/", "-", "!"}, // "
            {"?", "”", "!", "-"}, // "
            {";", ",", "”", "/"}, // /
    };



    private String answerList[] =
            {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ",", ";", "’", ":", "-", ".", ".", "!", "?", "“", "”", "/"};




    public String getQuestion(int i) {
        String question = categoryList[i];
        return question;
    }

    public String getImage(int i) {
        String image = imageList[i];
        return image;
    }


    public String getChoice1(int i) {
        String choice0 = choiceList[i][0];
        return choice0;
    }


    public String getChoice2(int i) {
        String choice1 = choiceList[i][1];
        return choice1;
    }

    public String getChoice3(int i) {
        String choice2 = choiceList[i][2];
        return choice2;
    }

    public String getChoice4(int i) {
        String choice3 = choiceList[i][3];
        return choice3;
    }

    public String getCorrectAnswer(int i) {
        String answer = answerList[i];
        return answer;
    }

    public int getQuestionLength() {
        int length = categoryList.length;
        return length;
    }

}