package com.example.digital_diary;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class viewpageradapter extends FragmentPagerAdapter {


    public viewpageradapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 9;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       if(position==0)
       {
           return new counciloffice();
       }
       else if(position==1)
       {
           return new deanoffaculty();
       }
       else if(position==2)
       {
           return new commiteeandboard();
       }
       else if(position==3)
       {
           return new residentialhall();
       }
       else if(position==4)
       {
           return new facultyanddept();
       }
       else if(position==5)
       {
           return new eduandresearchcenter();
       }
       else if(position==6)
       {
           return new IToffice();
       }
       else if(position==7)
       {
           return new versityoffices();
       }
       else
       {
           return new otherinstitionofcampus();
       }

    }
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
        {
            return "Council Office";
        }
        else if(position==1)
        {
            return  "Dean of Faculty";
        }
        else if(position==2)
        {
            return "Commitee and Board";
        }
        else if(position==3)
        {
            return "Residential Hall";
        }
        else if(position==4)
        {
            return "Faculty and Departments";
        }
        else if(position==5)
        {
            return "ERC";
        }
        else if(position==6)
        {
            return  "IT Office";
        }
        else if(position==7)
        {
            return "University's offices";
        }
        else
        {
            return "Others in campus";
        }

    }
}
