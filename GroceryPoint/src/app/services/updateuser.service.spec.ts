import { TestBed } from '@angular/core/testing';

import { UpdateuserService } from './updateuser.service';

describe('UpdateuserService', () => {
  let service: UpdateuserService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UpdateuserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
