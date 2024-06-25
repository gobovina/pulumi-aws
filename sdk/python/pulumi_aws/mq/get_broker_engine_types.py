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
from . import outputs

__all__ = [
    'GetBrokerEngineTypesResult',
    'AwaitableGetBrokerEngineTypesResult',
    'get_broker_engine_types',
    'get_broker_engine_types_output',
]

@pulumi.output_type
class GetBrokerEngineTypesResult:
    """
    A collection of values returned by getBrokerEngineTypes.
    """
    def __init__(__self__, broker_engine_types=None, engine_type=None, id=None):
        if broker_engine_types and not isinstance(broker_engine_types, list):
            raise TypeError("Expected argument 'broker_engine_types' to be a list")
        pulumi.set(__self__, "broker_engine_types", broker_engine_types)
        if engine_type and not isinstance(engine_type, str):
            raise TypeError("Expected argument 'engine_type' to be a str")
        pulumi.set(__self__, "engine_type", engine_type)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="brokerEngineTypes")
    def broker_engine_types(self) -> Sequence['outputs.GetBrokerEngineTypesBrokerEngineTypeResult']:
        """
        A list of available engine types and versions. See Engine Types.
        """
        return pulumi.get(self, "broker_engine_types")

    @property
    @pulumi.getter(name="engineType")
    def engine_type(self) -> Optional[str]:
        """
        The broker's engine type.
        """
        return pulumi.get(self, "engine_type")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetBrokerEngineTypesResult(GetBrokerEngineTypesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBrokerEngineTypesResult(
            broker_engine_types=self.broker_engine_types,
            engine_type=self.engine_type,
            id=self.id)


def get_broker_engine_types(engine_type: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBrokerEngineTypesResult:
    """
    Retrieve information about available broker engines.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.mq.get_broker_engine_types(engine_type="ACTIVEMQ")
    ```


    :param str engine_type: The MQ engine type to return version details for.
    """
    __args__ = dict()
    __args__['engineType'] = engine_type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:mq/getBrokerEngineTypes:getBrokerEngineTypes', __args__, opts=opts, typ=GetBrokerEngineTypesResult).value

    return AwaitableGetBrokerEngineTypesResult(
        broker_engine_types=pulumi.get(__ret__, 'broker_engine_types'),
        engine_type=pulumi.get(__ret__, 'engine_type'),
        id=pulumi.get(__ret__, 'id'))


@_utilities.lift_output_func(get_broker_engine_types)
def get_broker_engine_types_output(engine_type: Optional[pulumi.Input[Optional[str]]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBrokerEngineTypesResult]:
    """
    Retrieve information about available broker engines.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.mq.get_broker_engine_types(engine_type="ACTIVEMQ")
    ```


    :param str engine_type: The MQ engine type to return version details for.
    """
    ...
