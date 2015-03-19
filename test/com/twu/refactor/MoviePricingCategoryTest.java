package com.twu.refactor;

import org.junit.Assert;
import org.junit.Test;

public class MoviePricingCategoryTest {
    @Test
    public void testKidsCategoryGiveCorrectCostFor4Days(){
        double actualCost = MoviePricingCategory.CHILDRENS.getCostFor(4);
        Assert.assertEquals(3, actualCost, 0.0);
    }
    @Test
    public void testKidsCategoryGiveCorrectCostForLessThan3Days(){
        double actualCostFor1Day = MoviePricingCategory.CHILDRENS.getCostFor(1);
        double actualCostFor2Days = MoviePricingCategory.CHILDRENS.getCostFor(2);
        Assert.assertEquals(1.5, actualCostFor1Day, 0.0);
        Assert.assertEquals(1.5, actualCostFor2Days, 0.0);
    }
    @Test
    public void testNewReleaseCategoryGiveCorrectCostFor6Days(){
        double actualCostFor6Day = MoviePricingCategory.NEW_RELEASE.getCostFor(6);
        Assert.assertEquals(18, actualCostFor6Day, 0.0);
    }

}