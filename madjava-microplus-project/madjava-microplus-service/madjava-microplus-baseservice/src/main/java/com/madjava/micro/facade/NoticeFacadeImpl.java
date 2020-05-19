package com.madjava.micro.facade;

//@Component
//@Service(interfaceClass = NoticeFacade.class)
public class NoticeFacadeImpl{
//	implements NoticeFacade{
	
//	@Autowired
//	private NoticeService noticeService;
//	
//	@Autowired
//	private NoticeConveter noticeConveter;
//
//	@Override
//	public void addNotice(NoticeData noticeData, String userPk) {
//		Notice notice = noticeConveter.converter(noticeData);
//		noticeService.addNotice(notice, userPk);
//	}
//
//	@Override
//	public void updateNotice(NoticeData noticeData, String userPk) {
//		if(noticeService.findByPk(noticeData.getPk()) == null) {
//			throw new BaseException(MessageEnum.NOT_EXIST_NOTICE_PK);
//		}
//		Notice notice = noticeConveter.converter(noticeData);
//		noticeService.updateNotice(notice, userPk);
//	}
//
//	@Override
//	public void deleteByPk(String pk) {
//		if(null == noticeService.findByPk(pk)) {
//			throw new BaseException(MessageEnum.NOT_EXIST_NOTICE_PK);
//		}
//		noticeService.deleteByPk(pk);
//	}
//
//	@Override
//	public int setEnabled(String pk, Boolean enable,String userPk) {
//		if(null == noticeService.findByPk(pk)) {
//			throw new BaseException(MessageEnum.NOT_EXIST_NOTICE_PK);
//		}
//		int result = noticeService.setEnabled(pk, enable,userPk);
//		return result;
//	}
//
//	@Override
//	public int setIsTop(String pk, Boolean isTop,String userPk) {
//		if(null == noticeService.findByPk(pk)) {
//			throw new BaseException(MessageEnum.NOT_EXIST_NOTICE_PK);
//		}
//		int result = noticeService.setIsTop(pk, isTop,userPk);
//		return result;
//	}
//
//	@Override
//	public NoticeData findByPk(String pk) {
//		Notice notice = noticeService.findByPk(pk);
//		if(null == notice) {
//			throw new BaseException(MessageEnum.NOT_EXIST_NOTICE);
//		}
//		NoticeData noticeData = noticeConveter.converterToData(notice);
//		return noticeData;
//	}
//
//	@Override
//	public ResultData<NoticeListResponseData> selectByQuery(NoticeQueryData noticeQueryData) {
//		List<Notice> notices = noticeService.selectByQuery(noticeQueryData);
//		if(CollectionUtils.isEmpty(notices)) {
//			throw new BaseException(MessageEnum.NOT_EXIST_NOTICE);
//		}
//		List<NoticeData> resultNotices = new ArrayList<NoticeData>();
//		noticeConveter.converterAll(notices, resultNotices);
//		
//		NoticeListResponseData noticeListResponseData = new NoticeListResponseData();
//		noticeListResponseData.setNoticeDatas(resultNotices);
//		PageData pageData  = new PageData();
//		//backoffice请求才计算pageData
//		if(null != noticeQueryData.getPageNo()) {
//			int total = noticeService.selectByQueryCount(noticeQueryData);
//			pageData.setTotal(total);
//			pageData.setTotalPage((int)Math.ceil((double) total / (double) noticeQueryData.getPageSize()));
//			pageData.setPageNo(noticeQueryData.getPageNo());
//			pageData.setRows(noticeQueryData.getPageSize());
//			pageData.setOffset((noticeQueryData.getPageNo()-1) * noticeQueryData.getPageSize());
//			noticeListResponseData.setPageData(pageData);
//		}
//		
//		return new ResultData<NoticeListResponseData>(noticeListResponseData, MessageEnum.SUCCESS);
//	}
	
		
}
