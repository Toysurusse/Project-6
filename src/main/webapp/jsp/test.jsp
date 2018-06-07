<!DOCTYPE html>

<html>

<head>

    <title>jQuery CalenStyle Default Example</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link href="https://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <script type="text/javascript" src="../bootstrap/CalenStyle-master/demo/js/jquery-ui-custom-1.11.2.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../bootstrap/CalenStyle-master/demo/css/jquery-ui-custom-1.11.2.min.css" />

    <link rel="stylesheet" type="text/css" href="../bootstrap/CalenStyle-master/src/calenstyle.css" />
    <link rel="stylesheet" type="text/css" href="../bootstrap/CalenStyle-master/src/calenstyle-jquery-ui-override.css" />
    <link rel="stylesheet" type="text/css" href="../bootstrap/CalenStyle-master/src/calenstyle-iconfont.css" />
    <script type="text/javascript" src="../bootstrap/CalenStyle-master/src/calenstyle.js"></script>

    <script type="text/javascript" src="../bootstrap/CalenStyle-master/demo/js/CalJsonGenerator.js"></script>

    <style type="text/css">

        /* --------------- Required --------------- */
        .calendarContOuter
        {
            width: 1000px;
            height: 600px;
            margin: 0px auto;

            font-size: 14px;
        }

        .cElemDatePicker
        {
            font-size: 14px;
        }

    </style>

    <script type="text/javascript">

        $(function()
        {

            $(".calendarContOuter").CalenStyle(
                {
                    /* --------------- Required --------------- */

                    fixedNumOfWeeksInMonthView: true,

                    calDataSource:
                        [
                            {
                                sourceFetchType: "DateRange",
                                sourceType: "FUNCTION",
                                source: function(fetchStartDate, fetchEndDate, durationStartDate, durationEndDate, oConfig, loadViewCallback)
                                {
                                    var calObj1 = this;
                                    calObj1.incrementDataLoadingCount(1);

                                    var oEventResponse = generateJsonEvents(fetchStartDate, fetchEndDate);
                                    console.log("Response " + fetchStartDate + " " + fetchEndDate);
                                    console.log(oEventResponse);
                                    if(oEventResponse != undefined)
                                    {
                                        if(oEventResponse[0])
                                        {
                                            calObj1.parseDataSource("eventSource", oEventResponse[1], durationStartDate, durationEndDate, loadViewCallback, oConfig, false);
                                        }
                                    }
                                }
                            }
                        ]
                });
        });

    </script>

</head>

<body>
<div id="jquery-script-menu">
    <div class="jquery-script-center">
        <div class="jquery-script-ads"><script type="text/javascript"><!--
        google_ad_client = "ca-pub-2783044520727903";
        /* jQuery_demo */
        google_ad_slot = "2780937993";
        google_ad_width = 728;
        google_ad_height = 90;
        //-->
        </script>
            <script type="text/javascript"
                    src="https://pagead2.googlesyndication.com/pagead/show_ads.js">
            </script></div>
        <div class="jquery-script-clear"></div>
    </div>
</div>
<h1 style=" margin:150px auto 50px auto; text-align:center;">jQuery CalenStyle Default Example</h1>
<!-- --------------- Required --------------- -->
<div class="calendarContOuter"></div>

</body>

</html>


