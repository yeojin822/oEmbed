function btn() {
    let url = $('#text_id').val();
    if (url == "") {
        alert("URL 을 입력해 주세요.")
        return;
    }

    // 조회 할 때마다 기존 내용 삭제
    $('#content_wrap').empty();
    $.ajax({
        type: "GET",
        url: "/api/oembed",
        contentType: "application/json+oembed",
        data: {url: url},
        success: function (response) {
            let cnt = 0;
            for (let key in response.body) {
                if (key == 'title') {
                    let title = key;
                    let content = response.body[title];
                    addHTML_Title(title, content);
                } else if (cnt % 2 == 0) {
                    let title = key;
                    let content = response.body[title];
                    addHTML(title, content);
                    cnt += 1;
                } else {
                    let title = key;
                    let content = response.body[title];
                    addHTML2(title, content);
                    cnt += 1;
                }

            }
        }
    });
}

// title 글자 크기 및 굵기 처리
function addHTML_Title(title, content) {
    let temphtml = `
             <div id="dateInContainer3">
                <ul id="text_type3">${title}</ul>
                <div>
                    <ul id="text_content3">'${content}'</ul>
                </div>
            </div>
            `;
    $('#content_wrap').append(temphtml);
}

// 배경색 흰색
function addHTML(title, content) {
    if (title === 'provider_url' || title === 'author_url' || title === 'thumbnail_url_with_play_button_') {
        let temphtml = `
             <div id="dateInContainer1">
                <ul id="text_type1">${title}</ul>
                <div>
                    <a id="text_content1">${content}</a>
                </div>
            </div>
            `;
        $('#content_wrap').append(temphtml);
        return;
    }

    if (title === 'thumbnail_url_with_play_button' || title === 'thumbnail_url') {
        let temphtml = `
             <div id="dateInContainer1">
                <ul id="text_type1">${title}</ul>
                <div>
                <a>${content}</a>
                    <span id="text_content1"><img src="${content}"></span>
                </div>
            </div>
            `;
        $('#content_wrap').append(temphtml);
        return;
    }
    let temphtml = `
             <div id="dateInContainer1">
                <ul id="text_type1">${title}</ul>
                <div>
                    <span id="text_content1">${content}</span>
                </div>
            </div>
            `;

    $('#content_wrap').append(temphtml);
}

// 배경색 회색
function addHTML2(title, content) {
    // a 태그 처리
    if (title === 'provider_url' || title === 'author_url' || title === 'thumbnail_url_with_play_button_') {
        let temphtml = `
             <div id="dateInContainer2">
                <ul id="text_type2">${title}</ul>
                <div>
                    <a id="text_content2">${content}</a>
                </div>
            </div>
            `;
        $('#content_wrap').append(temphtml);
        return;
    }

    // 이미지 처리
    if (title === 'thumbnail_url_with_play_button' || title === 'thumbnail_url') {
        let temphtml = `
             <div id="dateInContainer2">
                <ul id="text_type2">${title}</ul>
                <div>
                    <span id="text_content2"><img src="${content}"></span>
                </div>
            </div>
            `;
        $('#content_wrap').append(temphtml);
        return;
    }

    let temphtml = `
             <div id="dateInContainer2">
                <ul id="text_type2">${title}</ul>
                <div>
                    <span id="text_content2">${content}</span>
                </div>
            </div>
            `;
    $('#content_wrap').append(temphtml);
}
