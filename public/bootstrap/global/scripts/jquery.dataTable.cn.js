(function(){
    var oLanguage={
        "oAria": {
            "sSortAscending": ": ��������",
            "sSortDescending": ": ��������"
        },
        "oPaginate": {
            "sFirst": "��ҳ",
            "sLast": "ĩҳ",
            "sNext": "��ҳ",
            "sPrevious": "��ҳ"
        },
        "sEmptyTable": "û����ؼ�¼",
        "sInfo": "�� _START_ �� _END_ ����¼���� _TOTAL_ ��",
        "sInfoEmpty": "�� 0 �� 0 ����¼���� 0 ��",
        "sInfoFiltered": "(�� _MAX_ ����¼�м���)",
        "sInfoPostFix": "",
        "sDecimal": "",
        "sThousands": ",",
        "sLengthMenu": "ÿҳ��ʾ����: _MENU_",
        "sLoadingRecords": "��������...",
        "sProcessing": "��������...",
        "sSearch": "����:",
        "sSearchPlaceholder": "",
        "sUrl": "",
        "sZeroRecords": "û����ؼ�¼"
    }
    $.fn.dataTable.defaults.oLanguage=oLanguage;
    //$.extend($.fn.dataTable.defaults.oLanguage,oLanguage)
})();