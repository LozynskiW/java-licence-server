package com.javalicence.question;

public enum QuestionDifficulty {

    EASY {
        @Override
        public String toString() {
            return "easy";
        }
    },
    MEDIUM {
        @Override
        public String toString() {
            return "medium";
        }
    },
    HARD {
        @Override
        public String toString() {
            return "hard";
        }
    };

    @Override
    public String toString() {
        return "QuestionDifficulty{}".toLowerCase();
    }
}
