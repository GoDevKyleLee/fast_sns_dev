package com.example.fastcampusmysql.utill;

import com.example.fastcampusmysql.domain.member.entity.Member;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;

public class MemberFixtrueFactory {

    static public Member create(){

        var param = new EasyRandomParameters();
        return new EasyRandom(param).nextObject(Member.class);
    }
}