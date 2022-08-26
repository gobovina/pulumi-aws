# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetTrackerAssociationResult',
    'AwaitableGetTrackerAssociationResult',
    'get_tracker_association',
    'get_tracker_association_output',
]

@pulumi.output_type
class GetTrackerAssociationResult:
    """
    A collection of values returned by getTrackerAssociation.
    """
    def __init__(__self__, consumer_arn=None, id=None, tracker_name=None):
        if consumer_arn and not isinstance(consumer_arn, str):
            raise TypeError("Expected argument 'consumer_arn' to be a str")
        pulumi.set(__self__, "consumer_arn", consumer_arn)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if tracker_name and not isinstance(tracker_name, str):
            raise TypeError("Expected argument 'tracker_name' to be a str")
        pulumi.set(__self__, "tracker_name", tracker_name)

    @property
    @pulumi.getter(name="consumerArn")
    def consumer_arn(self) -> str:
        return pulumi.get(self, "consumer_arn")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="trackerName")
    def tracker_name(self) -> str:
        return pulumi.get(self, "tracker_name")


class AwaitableGetTrackerAssociationResult(GetTrackerAssociationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTrackerAssociationResult(
            consumer_arn=self.consumer_arn,
            id=self.id,
            tracker_name=self.tracker_name)


def get_tracker_association(consumer_arn: Optional[str] = None,
                            tracker_name: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTrackerAssociationResult:
    """
    Retrieve information about a Location Service Tracker Association.

    ## Example Usage
    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.location.get_tracker_association(consumer_arn="arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer",
        tracker_name="example")
    ```


    :param str consumer_arn: The Amazon Resource Name (ARN) of the geofence collection associated to tracker resource.
    :param str tracker_name: The name of the tracker resource associated with a geofence collection.
    """
    __args__ = dict()
    __args__['consumerArn'] = consumer_arn
    __args__['trackerName'] = tracker_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:location/getTrackerAssociation:getTrackerAssociation', __args__, opts=opts, typ=GetTrackerAssociationResult).value

    return AwaitableGetTrackerAssociationResult(
        consumer_arn=__ret__.consumer_arn,
        id=__ret__.id,
        tracker_name=__ret__.tracker_name)


@_utilities.lift_output_func(get_tracker_association)
def get_tracker_association_output(consumer_arn: Optional[pulumi.Input[str]] = None,
                                   tracker_name: Optional[pulumi.Input[str]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTrackerAssociationResult]:
    """
    Retrieve information about a Location Service Tracker Association.

    ## Example Usage
    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.location.get_tracker_association(consumer_arn="arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer",
        tracker_name="example")
    ```


    :param str consumer_arn: The Amazon Resource Name (ARN) of the geofence collection associated to tracker resource.
    :param str tracker_name: The name of the tracker resource associated with a geofence collection.
    """
    ...
