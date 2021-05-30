package com.interviewPrep.leetCode.easy.array;

public class MajorityElement {
    MajorityEleCounter mECounter = new MajorityEleCounter();
    public int majorityElement(int[] nums) {
        for (int indx = 0; indx < nums.length; indx++) {
            if(mECounter.getCount() == 0) {
                mECounter.setElm(nums[indx]);
                mECounter.setCount(1);
            } else if (mECounter.getElm() == nums[indx]) {
                mECounter.setCount(mECounter.getCount() + 1);
            } else if (mECounter.getElm() != nums[indx]) {
                mECounter.setCount(mECounter.getCount() - 1);
            }
        }
        return ((mECounter.getCount() > 0) ? mECounter.getElm() : 0);
    }

    class MajorityEleCounter {
        int elm;
        int count;

        public void setElm(int elm) {
            this.elm = elm;
        }
        public int getElm() {
            return this.elm;
        }
        public void setCount(int count) {
            this.count = count;
        }
        public int getCount() {
            return this.count;
        }
    }
}
