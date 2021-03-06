package cc.mrbird.febs.gateway.enhance.service;

import cc.mrbird.febs.gateway.enhance.entity.BlackList;
import cc.mrbird.febs.gateway.enhance.entity.RateLimitRule;
import reactor.core.publisher.Flux;

import java.util.Set;

public interface RouteEnhanceCacheService {

    void saveAllBlackList(Flux<BlackList> blackList);

    void removeBlackList(BlackList blackList);

    void saveAllRateLimitRules(Flux<RateLimitRule> rateLimitRules);

    void saveBlackList(BlackList blackList);

    Set<Object> getBlackList(String ip);

    Set<Object> getBlackList();

    void saveRateLimitRule(RateLimitRule rateLimitRule);

    Object getRateLimitRule(String uri, String method);

    int getCurrentRequestCount(String uri, String ip);

    void removeRateLimitRule(RateLimitRule rateLimitRule);

    void setCurrentRequestCount(String uri, String ip, Long time);

    void incrCurrentRequestCount(String uri, String ip);
}
