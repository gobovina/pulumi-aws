# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = [
    'GetFindingIdsResult',
    'AwaitableGetFindingIdsResult',
    'get_finding_ids',
    'get_finding_ids_output',
]

@pulumi.output_type
class GetFindingIdsResult:
    """
    A collection of values returned by getFindingIds.
    """
    def __init__(__self__, detector_id=None, finding_ids=None, has_findings=None, id=None):
        if detector_id and not isinstance(detector_id, str):
            raise TypeError("Expected argument 'detector_id' to be a str")
        pulumi.set(__self__, "detector_id", detector_id)
        if finding_ids and not isinstance(finding_ids, list):
            raise TypeError("Expected argument 'finding_ids' to be a list")
        pulumi.set(__self__, "finding_ids", finding_ids)
        if has_findings and not isinstance(has_findings, bool):
            raise TypeError("Expected argument 'has_findings' to be a bool")
        pulumi.set(__self__, "has_findings", has_findings)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="detectorId")
    def detector_id(self) -> str:
        return pulumi.get(self, "detector_id")

    @property
    @pulumi.getter(name="findingIds")
    def finding_ids(self) -> Sequence[str]:
        """
        A list of finding IDs for the specified detector.
        """
        return pulumi.get(self, "finding_ids")

    @property
    @pulumi.getter(name="hasFindings")
    def has_findings(self) -> bool:
        """
        Indicates whether findings are present for the specified detector.
        """
        return pulumi.get(self, "has_findings")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")


class AwaitableGetFindingIdsResult(GetFindingIdsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFindingIdsResult(
            detector_id=self.detector_id,
            finding_ids=self.finding_ids,
            has_findings=self.has_findings,
            id=self.id)


def get_finding_ids(detector_id: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFindingIdsResult:
    """
    Data source for managing an AWS GuardDuty Finding Ids.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.guardduty.get_finding_ids(detector_id=example_aws_guardduty_detector["id"])
    ```


    :param str detector_id: ID of the GuardDuty detector.
    """
    __args__ = dict()
    __args__['detectorId'] = detector_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:guardduty/getFindingIds:getFindingIds', __args__, opts=opts, typ=GetFindingIdsResult).value

    return AwaitableGetFindingIdsResult(
        detector_id=pulumi.get(__ret__, 'detector_id'),
        finding_ids=pulumi.get(__ret__, 'finding_ids'),
        has_findings=pulumi.get(__ret__, 'has_findings'),
        id=pulumi.get(__ret__, 'id'))


@_utilities.lift_output_func(get_finding_ids)
def get_finding_ids_output(detector_id: Optional[pulumi.Input[str]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFindingIdsResult]:
    """
    Data source for managing an AWS GuardDuty Finding Ids.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.guardduty.get_finding_ids(detector_id=example_aws_guardduty_detector["id"])
    ```


    :param str detector_id: ID of the GuardDuty detector.
    """
    ...
