package com.lol.constans;

/**
 * 英雄属性配置表
 */
public class HeroData {

    public static final java.util.HashMap<Integer, HeroDataModel> heroMap = new java.util.HashMap<Integer, HeroDataModel>();

    /**
     静态构造 初次访问的时候自动调用

     */
    static {
        create(1, "阿狸", 100, 20, 500, 300, 5, 2, 30, 10, 1, 0.5f, 200, 200, new int[]{1, 2, 3, 4});
        create(2, "阿木木", 100, 20, 500, 300, 5, 2, 30, 10, 1, 0.5f, 200, 200, new int[]{1, 2, 3, 4});
        create(3, "埃希", 100, 20, 500, 300, 5, 2, 30, 10, 1, 0.5f, 200, 200, new int[]{6, 2, 3, 4});
        create(4, "盲僧", 100, 20, 500, 300, 5, 2, 30, 10, 1, 0.5f, 200, 200, new int[]{3, 2, 3, 4});
    }

    /**
     * 创建模型并添加进字典
     *
     * @param code
     * @param name
     * @param atkBase
     * @param defBase
     * @param hpBase
     * @param mpBase
     * @param atkArr
     * @param defArr
     * @param hpArr
     * @param mpArr
     * @param speed
     * @param aSpeed
     * @param range
     * @param eyeRange
     * @param skills
     */
    private static void create(int code, String name, int atkBase, int defBase, int hpBase, int mpBase, int atkArr, int defArr, int hpArr, int mpArr, float speed, float aSpeed, float range, float eyeRange, int[] skills) {
        HeroDataModel model = new HeroDataModel();
        model.code = code;
        model.name = name;
        model.atkBase = atkBase;
        model.defBase = defBase;
        model.hpBase = hpBase;
        model.mpBase = mpBase;
        model.atkArr = atkArr;
        model.defArr = defArr;
        model.hpArr = hpArr;
        model.mpArr = mpArr;
        model.speed = speed;
        model.aSpeed = aSpeed;
        model.range = range;
        model.eyeRange = eyeRange;
        model.skills = skills;
        heroMap.put(code, model);
    }
}