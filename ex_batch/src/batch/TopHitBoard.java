package batch;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import dao.BoardDAO;
import dto.BoardDTO;

public class TopHitBoard implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		List<BoardDTO> hit = BoardDAO.getInstance().selectList();
		try {
			System.out.println(hit);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
