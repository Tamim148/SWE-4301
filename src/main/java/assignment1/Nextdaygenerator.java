
    package assignment1;


    public class Nextdaygenerator {
        private int day;
        private int month;
        private int year;
        public Nextdaygenerator(int day, int month,int year)
        {
            this.day=day;
            this.month=month;
            this.year=year;
        }

        public int getDay() {
            return day;
        }

        public int getYear() {
            return year;
        }

        public int getMonth() {
            return month;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public Boolean isLeapYear(int year){
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){return true;}
            else
                return false;
        }

        public boolean  isMonth31days(int month){
            if(month>7 && month%2==0)
            {
                return true ;
            } else if (month<7 && month%2!=0) {
                return true;
            }
            else
                return false;

        }
        public boolean  isMonth30days(int month){
            if(month>7 && month%2==0)
            {
                return false ;
            } else if (month<7 && month%2!=0) {
                return false;
            }
            else
                return true;

        }
        public boolean  isItFebruary(int month){
            if(month==2)
            {
                return true;
            }
            else
                return false;
        }

        public boolean  isItDecember(int month){
            if(month==12)
            {
                return true;
            }
            else
                return false;
        }
        public boolean  isIt31stday(int day){
            if(day==31)
            {
                return true;
            }
            else
                return false;
        }
        public boolean  isIt30thday(int day){
            if(day==30)
            {
                return true;
            }
            else
                return false;
        }
        public boolean  isIt29thday(int day){
            if(day==29)
            {
                return true;
            }
            else
                return false;
        }
        public boolean  isIt28thday(int day){
            if(day==29)
            {
                return true;
            }
            else
                return false;
        }




        public String getNextDay(int day,int month,int year) {
            String s="";
            int d=day;
            int y=year;
            int m=month;
            if(isMonth31days(month))
            {
                if(isItDecember(month))
                {
                    if(isIt31stday(day))
                    {
                        d=1;
                        m=1;
                        y++;
                    }
                    else
                    {
                        d++;
                    }
                }
                else
                {
                    if(isIt31stday(day))
                    {
                        d=1;
                        m++;
                    }
                    else
                    {
                        d++;
                    }
                }
            }
            else if (isMonth30days(month))
            {
                if(isItFebruary(month))
                {
                    if(isLeapYear(year))
                    {
                        if(isIt29thday(day))
                        {
                            d=1;
                            m++;
                        }
                        else
                        {
                            d++;
                        }
                    }
                    else
                    {
                        if(isIt28thday(day))
                        {
                            d=1;
                            m++;
                        }
                        else
                        {
                            d++;
                        }

                    }

                }
                else
                {
                    if(isIt30thday(day)){
                        d=1;
                        m++;
                    }
                    else
                    {
                        d++;
                    }

                }
            }

            s="The next day is: "+d+"."+m+"."+y;

            return s;
        }






    }


