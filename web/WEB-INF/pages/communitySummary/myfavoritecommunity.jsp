<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="sumheader.jsp"></jsp:include>
<div id="pageContent" style="min-width:1140px;">

    <div class="wrapper">
        <div class="container pt20">
            <div>
                <ul class="navigator clearfix">
                    <li
                            <c:if test="${comtype=='mycommunity'}">class="current"</c:if> ><i></i><a href="mycommunity">我创建的学社</a>
                    </li>
                    <li <c:if test="${comtype=='myfavoritecommunity'}">class="current"</c:if>><i></i><a
                            href="myfavoritecommunity">我喜好的学社</a></li>
                    <li <c:if test="${comtype=='myjoincommunity'}">class="current"</c:if>><i></i><a
                            href="myjoincommunity">我加入的学社</a></li>

                </ul>
            </div>
            <div id="topic_list_forme" class="" style="display: block;">
                <ul>

                    <li class="clearfix">
                        <div class="col-33 col-33_bg">
                            <div class="st-li"><a href="/listenmore/" target="_blank">
                                <div class="row row-1">
                                    <div class="col-4">
                                        <div class="pic" align="center"><img class=""
                                                                             src="./files_com/2017-06-01-1496246655-322-3667.jpg"
                                                                             alt="AWE词汇社">
                                            <!--                                    <img src="images/my_c3.png" alt="视听森林" title="视听森林">-->
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="title"> 视听森林 <span
                                                style="float: right;margin-right: 16px;font-family: 楷体,楷体_GB2312;font-size: 18px;color: #e61d36;font-weight: 700;">喜</span>
                                        </div>
                                        <div class="info"> 社长: hahaleaf <span
                                                style="float: right;color: #5ab6d0;">老师社</span></div>
                                        <div class="summary grey"> 欢迎来到视听森林一起玩转多语种！是不是觉得帖子太多一脸懵逼？直接点击标签，学社内容全掌握</div>
                                    </div>
                                </div>
                            </a>
                                <div class="row row-2">
                                    <div class="fr"><a href="/listenmore/" rel="nofollow" target="_blank">进入学社</a></div>
                                    <span class="fl">成员: 10821</span> <span class="unsigned-icon" data-id="6221"></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-33 col-33_bg">
                            <div class="st-li"><a href="/listenmore/" target="_blank">
                                <div class="row row-1">
                                    <div class="col-4">
                                        <div class="pic" align="center"><img class=""
                                                                             src="./files_com/c9ac691c-378b-47ed-9d1b-5581ea348ee0(1).jpg"
                                                                             alt="AWE词汇社">
                                            <!--                                    <img src="images/my_c3.png" alt="视听森林" title="视听森林">-->
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="title"> 视听森林 <span
                                                style="float: right;margin-right: 16px;font-family: 楷体,楷体_GB2312;font-size: 18px;color: #e61d36;font-weight: 700;">喜</span>
                                        </div>
                                        <div class="info"> 社长: hahaleaf</div>
                                        <div class="summary grey"> 欢迎来到视听森林一起玩转多语种！是不是觉得帖子太多一脸懵逼？直接点击标签，学社内容全掌握?</div>
                                    </div>
                                </div>
                            </a>
                                <div class="row row-2">
                                    <div class="fr"><a href="/listenmore/" rel="nofollow" target="_blank">进入学社</a></div>
                                    <span class="fl">成员: 10821</span> <span class="unsigned-icon" data-id="6221"></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-33 col-33_bg">
                            <div class="st-li"><a href="/listenmore/" target="_blank">
                                <div class="row row-1">
                                    <div class="col-4">
                                        <div class="pic" align="center"><img class=""
                                                                             src="./files_com/c9ac691c-378b-47ed-9d1b-5581ea348ee0(1).jpg"
                                                                             alt="AWE词汇社">
                                            <!--                                    <img src="images/my_c3.png" alt="视听森林" title="视听森林">-->
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="title"> 视听森林 <span
                                                style="float: right;margin-right: 16px;font-family: 楷体,楷体_GB2312;font-size: 18px;color: #e61d36;font-weight: 700;">喜</span>
                                        </div>
                                        <div class="info"> 社长: hahaleaf <span
                                                style="float: right;color: #5ab6d0;">机构社</span></div>
                                        <div class="summary grey"> 欢迎来到视听森林一起玩转多语种！是不是觉得帖子太多一脸懵逼？直接点击标签，学社内容全掌握?</div>
                                    </div>
                                </div>
                            </a>
                                <div class="row row-2">
                                    <div class="fr"><a href="/listenmore/" rel="nofollow" target="_blank">进入学社</a></div>
                                    <span class="fl">成员: 10821</span> <span class="unsigned-icon" data-id="6221"></span>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="clearfix">
                        <div class="col-33 col-33_bg">
                            <div class="st-li"><a href="/listenmore/" target="_blank">
                                <div class="row row-1">
                                    <div class="col-4">
                                        <div class="pic" align="center"><img class=""
                                                                             src="./files_com/2017-06-01-1496246655-322-3667.jpg"
                                                                             alt="AWE词汇社">
                                            <!--                                    <img src="images/my_c3.png" alt="视听森林" title="视听森林">-->
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="title"> 视听森林 <span
                                                style="float: right;margin-right: 16px;font-family: 楷体,楷体_GB2312;font-size: 18px;color: #e61d36;font-weight: 700;">喜</span>
                                        </div>
                                        <div class="info"> 社长: hahaleaf <span
                                                style="float: right;color: #5ab6d0;">老师社</span></div>
                                        <div class="summary grey"> 欢迎来到视听森林一起玩转多语种！是不是觉得帖子太多一脸懵逼？直接点击标签，学社内容全掌握</div>
                                    </div>
                                </div>
                            </a>
                                <div class="row row-2">
                                    <div class="fr"><a href="/listenmore/" rel="nofollow" target="_blank">进入学社</a></div>
                                    <span class="fl">成员: 10821</span> <span class="unsigned-icon" data-id="6221"></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-33 col-33_bg">
                            <div class="st-li"><a href="/listenmore/" target="_blank">
                                <div class="row row-1">
                                    <div class="col-4">
                                        <div class="pic" align="center"><img class=""
                                                                             src="./files_com/c9ac691c-378b-47ed-9d1b-5581ea348ee0(1).jpg"
                                                                             alt="AWE词汇社">
                                            <!--                                    <img src="images/my_c3.png" alt="视听森林" title="视听森林">-->
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="title"> 视听森林 <span
                                                style="float: right;margin-right: 16px;font-family: 楷体,楷体_GB2312;font-size: 18px;color: #e61d36;font-weight: 700;">喜</span>
                                        </div>
                                        <div class="info"> 社长: hahaleaf</div>
                                        <div class="summary grey"> 欢迎来到视听森林一起玩转多语种！是不是觉得帖子太多一脸懵逼？直接点击标签，学社内容全掌握?</div>
                                    </div>
                                </div>
                            </a>
                                <div class="row row-2">
                                    <div class="fr"><a href="/listenmore/" rel="nofollow" target="_blank">进入学社</a></div>
                                    <span class="fl">成员: 10821</span> <span class="unsigned-icon" data-id="6221"></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-33 col-33_bg">
                            <div class="st-li"><a href="/listenmore/" target="_blank">
                                <div class="row row-1">
                                    <div class="col-4">
                                        <div class="pic" align="center"><img class=""
                                                                             src="./files_com/c9ac691c-378b-47ed-9d1b-5581ea348ee0(1).jpg"
                                                                             alt="AWE词汇社">
                                            <!--                                    <img src="images/my_c3.png" alt="视听森林" title="视听森林">-->
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="title"> 视听森林 <span
                                                style="float: right;margin-right: 16px;font-family: 楷体,楷体_GB2312;font-size: 18px;color: #e61d36;font-weight: 700;">喜</span>
                                        </div>
                                        <div class="info"> 社长: hahaleaf <span
                                                style="float: right;color: #5ab6d0;">机构社</span></div>
                                        <div class="summary grey"> 欢迎来到视听森林一起玩转多语种！</div>
                                    </div>
                                </div>
                            </a>
                                <div class="row row-2">
                                    <div class="fr"><a href="/listenmore/" rel="nofollow" target="_blank">进入学社</a></div>
                                    <span class="fl">成员: 10821</span> <span class="unsigned-icon" data-id="6221"></span>
                                </div>
                            </div>
                        </div>
                    </li>


                </ul>
                <!--              <div class="more"><a href="http://st.awe.com/mt/p4/" target="_blank" rel="nofollow">查看更多 &gt; </a></div>-->
            </div>

        </div>
    </div>

</div>
<jsp:include page="sumfooter.jsp"></jsp:include>