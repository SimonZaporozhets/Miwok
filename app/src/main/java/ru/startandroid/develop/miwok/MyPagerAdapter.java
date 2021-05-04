package ru.startandroid.develop.miwok;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new ColorsFragment();
            }
            case 1: {
                return new PhrasesFragment();
            }
            case 2: {
                return new FamilyMembersFragment();
            }
            case 3: {
                return new NumbersFragment();
            }
            default: {
                return null;
            }
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: {
                return "COLORS";
            }
            case 1: {
                return "PHRASES";
            }
            case 2: {
                return "FAMILY MEMBERS";
            }
            case 3: {
                return "NUMBERS";
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
