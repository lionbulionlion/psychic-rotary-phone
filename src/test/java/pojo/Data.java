package pojo;

public class Data{
        public String code;
        public String alfa2;
        public String alfa3;
        public String name_short;
        public String name;

        public Data(){}

        public Data(String code, String alfa2, String alfa3, String name_short, String name) {
                this.code = code;
                this.alfa2 = alfa2;
                this.alfa3 = alfa3;
                this.name_short = name_short;
                this.name = name;
        }

        public String getCode() {
                return code;
        }

        public String getAlfa2() {
                return alfa2;
        }

        public String getAlfa3() {
                return alfa3;
        }

        public String getName_short() {
                return name_short;
        }

        public String getName() {
                return name;
        }


}
