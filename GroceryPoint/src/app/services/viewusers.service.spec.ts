import { TestBed } from '@angular/core/testing';

import { ViewusersService } from './viewusers.service';

describe('ViewusersService', () => {
  let service: ViewusersService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ViewusersService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
