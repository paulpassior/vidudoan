<%-- 
    Document   : ResultPage
    Created on : Apr 28, 2020, 6:53:45 PM
    Author     : ADMIN-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;400&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;400;500;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div id="id_page">
            
            <div id="left_side"  class="col-lg-2">
                <img id="logo" src="image/logo.png" />
            </div>
            <div id="middle_side" class="col-lg-5">
                <div id="above_part">
                    <p class="label_2">Quý khách có lịch khám</p>
                    <p class="label_3">Xin quý khách đến trước giờ hẹn ít nhất 10 phút. Số khám của quý khách là:</p>

                    <div class="order_number">
                        <span id="order_num">100</span>
                    </div>
                    <hr style="margin-top: 32px;"/>
                    <label class="label_style2">Khoa:</label><label class="content_style2 exam_department">Nội thần kính</label>
                    <hr/>
                    <label class="label_style2">Ngày khám:</label><label class="content_style2">04 tháng 12, 2019</label>
                    <hr/>
                    <label class="label_style2">Thời gian:</label><label class="content_style2" id="time_id">15 giờ 00 phút</label>
                </div>
                <div id="beneath_part">            
                    <label id="announcement_title">Thông báo<span style="color: red;">*</span></label>
                    <div id="announce_area_2">
                        <p>14 giờ 00 phút, 04 tháng 12, 2019</p>
                        <p>Sắp đến lượt khám của quý khách. Mong quý khách đến bệnh viện đúng giờ.
                        Sắp đến lượt khám của quý khách. Mong quý khách đến bệnh viện đúng giờ.
                        Sắp đến lượt khám của quý khách. Mong quý khách đến bệnh viện đúng giờ.
                        Sắp đến lượt khám của quý khách. Mong quý khách đến bệnh viện đúng giờ.</p>
                    </div>
                    <div id="announce_area">
                        <div id="announce_box">
                            <p>22 giờ 01 phút, 03 tháng 12, 2019</p>
                            <p>Quý khách đã được chuyển đến khoa <span class="exam_department">Chấn thương chỉnh hình</span> do Y tá Trịnh A
                            Quý khách đã được chuyển đến khoa <span class="exam_department">Chấn thương chỉnh hình</span> do Y tá Trịnh A
                            Quý khách đã được chuyển đến khoa <span class="exam_department">Chấn thương chỉnh hình</span> do Y tá Trịnh A
                            Quý khách đã được chuyển đến khoa <span class="exam_department">Chấn thương chỉnh hình</span> do Y tá Trịnh A</p>
                        </div>
                    </div>
                </div>
            </div>
            <div id="right_side" class="col-lg-5">
                <img id="id_map" src="image/bando.png"/>
                <div id="zoom_in">
                    <img src="image/zoomin.png"/>
                </div>
                <div id="zoom_out">
                    <img src="image/zoomout.png"/>
                </div>
            </div>
<!--                        <div id="api_booking">
                            <div class="app_booking app_zalo">
                                <img src="image/zalo-1.jpg"/><label>Zalo</label>
                            </div>
                            <div class="app_booking app_viber">
                                <img src="image/viberimg.png"/><label>Viber</label>
                            </div>
                            <div class="app_booking app_facebook">
                                <img src="image/facebookimg.png"/><label>Fb</label>
                            </div>
                        </div>-->
        </div>
    </body>
</html>
