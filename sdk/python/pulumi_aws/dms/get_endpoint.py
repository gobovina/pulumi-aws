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
    'GetEndpointResult',
    'AwaitableGetEndpointResult',
    'get_endpoint',
    'get_endpoint_output',
]

@pulumi.output_type
class GetEndpointResult:
    """
    A collection of values returned by getEndpoint.
    """
    def __init__(__self__, certificate_arn=None, database_name=None, elasticsearch_settings=None, endpoint_arn=None, endpoint_id=None, endpoint_type=None, engine_name=None, extra_connection_attributes=None, id=None, kafka_settings=None, kinesis_settings=None, kms_key_arn=None, mongodb_settings=None, password=None, port=None, postgres_settings=None, redis_settings=None, redshift_settings=None, s3_settings=None, secrets_manager_access_role_arn=None, secrets_manager_arn=None, server_name=None, service_access_role=None, ssl_mode=None, tags=None, username=None):
        if certificate_arn and not isinstance(certificate_arn, str):
            raise TypeError("Expected argument 'certificate_arn' to be a str")
        pulumi.set(__self__, "certificate_arn", certificate_arn)
        if database_name and not isinstance(database_name, str):
            raise TypeError("Expected argument 'database_name' to be a str")
        pulumi.set(__self__, "database_name", database_name)
        if elasticsearch_settings and not isinstance(elasticsearch_settings, list):
            raise TypeError("Expected argument 'elasticsearch_settings' to be a list")
        pulumi.set(__self__, "elasticsearch_settings", elasticsearch_settings)
        if endpoint_arn and not isinstance(endpoint_arn, str):
            raise TypeError("Expected argument 'endpoint_arn' to be a str")
        pulumi.set(__self__, "endpoint_arn", endpoint_arn)
        if endpoint_id and not isinstance(endpoint_id, str):
            raise TypeError("Expected argument 'endpoint_id' to be a str")
        pulumi.set(__self__, "endpoint_id", endpoint_id)
        if endpoint_type and not isinstance(endpoint_type, str):
            raise TypeError("Expected argument 'endpoint_type' to be a str")
        pulumi.set(__self__, "endpoint_type", endpoint_type)
        if engine_name and not isinstance(engine_name, str):
            raise TypeError("Expected argument 'engine_name' to be a str")
        pulumi.set(__self__, "engine_name", engine_name)
        if extra_connection_attributes and not isinstance(extra_connection_attributes, str):
            raise TypeError("Expected argument 'extra_connection_attributes' to be a str")
        pulumi.set(__self__, "extra_connection_attributes", extra_connection_attributes)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kafka_settings and not isinstance(kafka_settings, list):
            raise TypeError("Expected argument 'kafka_settings' to be a list")
        pulumi.set(__self__, "kafka_settings", kafka_settings)
        if kinesis_settings and not isinstance(kinesis_settings, list):
            raise TypeError("Expected argument 'kinesis_settings' to be a list")
        pulumi.set(__self__, "kinesis_settings", kinesis_settings)
        if kms_key_arn and not isinstance(kms_key_arn, str):
            raise TypeError("Expected argument 'kms_key_arn' to be a str")
        pulumi.set(__self__, "kms_key_arn", kms_key_arn)
        if mongodb_settings and not isinstance(mongodb_settings, list):
            raise TypeError("Expected argument 'mongodb_settings' to be a list")
        pulumi.set(__self__, "mongodb_settings", mongodb_settings)
        if password and not isinstance(password, str):
            raise TypeError("Expected argument 'password' to be a str")
        pulumi.set(__self__, "password", password)
        if port and not isinstance(port, int):
            raise TypeError("Expected argument 'port' to be a int")
        pulumi.set(__self__, "port", port)
        if postgres_settings and not isinstance(postgres_settings, list):
            raise TypeError("Expected argument 'postgres_settings' to be a list")
        pulumi.set(__self__, "postgres_settings", postgres_settings)
        if redis_settings and not isinstance(redis_settings, list):
            raise TypeError("Expected argument 'redis_settings' to be a list")
        pulumi.set(__self__, "redis_settings", redis_settings)
        if redshift_settings and not isinstance(redshift_settings, list):
            raise TypeError("Expected argument 'redshift_settings' to be a list")
        pulumi.set(__self__, "redshift_settings", redshift_settings)
        if s3_settings and not isinstance(s3_settings, list):
            raise TypeError("Expected argument 's3_settings' to be a list")
        pulumi.set(__self__, "s3_settings", s3_settings)
        if secrets_manager_access_role_arn and not isinstance(secrets_manager_access_role_arn, str):
            raise TypeError("Expected argument 'secrets_manager_access_role_arn' to be a str")
        pulumi.set(__self__, "secrets_manager_access_role_arn", secrets_manager_access_role_arn)
        if secrets_manager_arn and not isinstance(secrets_manager_arn, str):
            raise TypeError("Expected argument 'secrets_manager_arn' to be a str")
        pulumi.set(__self__, "secrets_manager_arn", secrets_manager_arn)
        if server_name and not isinstance(server_name, str):
            raise TypeError("Expected argument 'server_name' to be a str")
        pulumi.set(__self__, "server_name", server_name)
        if service_access_role and not isinstance(service_access_role, str):
            raise TypeError("Expected argument 'service_access_role' to be a str")
        pulumi.set(__self__, "service_access_role", service_access_role)
        if ssl_mode and not isinstance(ssl_mode, str):
            raise TypeError("Expected argument 'ssl_mode' to be a str")
        pulumi.set(__self__, "ssl_mode", ssl_mode)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter(name="certificateArn")
    def certificate_arn(self) -> str:
        return pulumi.get(self, "certificate_arn")

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> str:
        return pulumi.get(self, "database_name")

    @property
    @pulumi.getter(name="elasticsearchSettings")
    def elasticsearch_settings(self) -> Sequence['outputs.GetEndpointElasticsearchSettingResult']:
        return pulumi.get(self, "elasticsearch_settings")

    @property
    @pulumi.getter(name="endpointArn")
    def endpoint_arn(self) -> str:
        return pulumi.get(self, "endpoint_arn")

    @property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> str:
        return pulumi.get(self, "endpoint_id")

    @property
    @pulumi.getter(name="endpointType")
    def endpoint_type(self) -> str:
        return pulumi.get(self, "endpoint_type")

    @property
    @pulumi.getter(name="engineName")
    def engine_name(self) -> str:
        return pulumi.get(self, "engine_name")

    @property
    @pulumi.getter(name="extraConnectionAttributes")
    def extra_connection_attributes(self) -> str:
        return pulumi.get(self, "extra_connection_attributes")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="kafkaSettings")
    def kafka_settings(self) -> Sequence['outputs.GetEndpointKafkaSettingResult']:
        return pulumi.get(self, "kafka_settings")

    @property
    @pulumi.getter(name="kinesisSettings")
    def kinesis_settings(self) -> Sequence['outputs.GetEndpointKinesisSettingResult']:
        return pulumi.get(self, "kinesis_settings")

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> str:
        return pulumi.get(self, "kms_key_arn")

    @property
    @pulumi.getter(name="mongodbSettings")
    def mongodb_settings(self) -> Sequence['outputs.GetEndpointMongodbSettingResult']:
        return pulumi.get(self, "mongodb_settings")

    @property
    @pulumi.getter
    def password(self) -> str:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def port(self) -> int:
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="postgresSettings")
    def postgres_settings(self) -> Sequence['outputs.GetEndpointPostgresSettingResult']:
        return pulumi.get(self, "postgres_settings")

    @property
    @pulumi.getter(name="redisSettings")
    def redis_settings(self) -> Sequence['outputs.GetEndpointRedisSettingResult']:
        return pulumi.get(self, "redis_settings")

    @property
    @pulumi.getter(name="redshiftSettings")
    def redshift_settings(self) -> Sequence['outputs.GetEndpointRedshiftSettingResult']:
        return pulumi.get(self, "redshift_settings")

    @property
    @pulumi.getter(name="s3Settings")
    def s3_settings(self) -> Sequence['outputs.GetEndpointS3SettingResult']:
        return pulumi.get(self, "s3_settings")

    @property
    @pulumi.getter(name="secretsManagerAccessRoleArn")
    def secrets_manager_access_role_arn(self) -> str:
        return pulumi.get(self, "secrets_manager_access_role_arn")

    @property
    @pulumi.getter(name="secretsManagerArn")
    def secrets_manager_arn(self) -> str:
        return pulumi.get(self, "secrets_manager_arn")

    @property
    @pulumi.getter(name="serverName")
    def server_name(self) -> str:
        return pulumi.get(self, "server_name")

    @property
    @pulumi.getter(name="serviceAccessRole")
    def service_access_role(self) -> str:
        return pulumi.get(self, "service_access_role")

    @property
    @pulumi.getter(name="sslMode")
    def ssl_mode(self) -> str:
        return pulumi.get(self, "ssl_mode")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def username(self) -> str:
        return pulumi.get(self, "username")


class AwaitableGetEndpointResult(GetEndpointResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEndpointResult(
            certificate_arn=self.certificate_arn,
            database_name=self.database_name,
            elasticsearch_settings=self.elasticsearch_settings,
            endpoint_arn=self.endpoint_arn,
            endpoint_id=self.endpoint_id,
            endpoint_type=self.endpoint_type,
            engine_name=self.engine_name,
            extra_connection_attributes=self.extra_connection_attributes,
            id=self.id,
            kafka_settings=self.kafka_settings,
            kinesis_settings=self.kinesis_settings,
            kms_key_arn=self.kms_key_arn,
            mongodb_settings=self.mongodb_settings,
            password=self.password,
            port=self.port,
            postgres_settings=self.postgres_settings,
            redis_settings=self.redis_settings,
            redshift_settings=self.redshift_settings,
            s3_settings=self.s3_settings,
            secrets_manager_access_role_arn=self.secrets_manager_access_role_arn,
            secrets_manager_arn=self.secrets_manager_arn,
            server_name=self.server_name,
            service_access_role=self.service_access_role,
            ssl_mode=self.ssl_mode,
            tags=self.tags,
            username=self.username)


def get_endpoint(endpoint_id: Optional[str] = None,
                 tags: Optional[Mapping[str, str]] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEndpointResult:
    """
    Data source for managing an AWS DMS (Database Migration) Endpoint.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.dms.get_endpoint(endpoint_id="test_id")
    ```


    :param str endpoint_id: Database endpoint identifier. Identifiers must contain from 1 to 255 alphanumeric characters or hyphens, begin with a letter, contain only ASCII letters, digits, and hyphens, not end with a hyphen, and not contain two consecutive hyphens.
    """
    __args__ = dict()
    __args__['endpointId'] = endpoint_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:dms/getEndpoint:getEndpoint', __args__, opts=opts, typ=GetEndpointResult).value

    return AwaitableGetEndpointResult(
        certificate_arn=pulumi.get(__ret__, 'certificate_arn'),
        database_name=pulumi.get(__ret__, 'database_name'),
        elasticsearch_settings=pulumi.get(__ret__, 'elasticsearch_settings'),
        endpoint_arn=pulumi.get(__ret__, 'endpoint_arn'),
        endpoint_id=pulumi.get(__ret__, 'endpoint_id'),
        endpoint_type=pulumi.get(__ret__, 'endpoint_type'),
        engine_name=pulumi.get(__ret__, 'engine_name'),
        extra_connection_attributes=pulumi.get(__ret__, 'extra_connection_attributes'),
        id=pulumi.get(__ret__, 'id'),
        kafka_settings=pulumi.get(__ret__, 'kafka_settings'),
        kinesis_settings=pulumi.get(__ret__, 'kinesis_settings'),
        kms_key_arn=pulumi.get(__ret__, 'kms_key_arn'),
        mongodb_settings=pulumi.get(__ret__, 'mongodb_settings'),
        password=pulumi.get(__ret__, 'password'),
        port=pulumi.get(__ret__, 'port'),
        postgres_settings=pulumi.get(__ret__, 'postgres_settings'),
        redis_settings=pulumi.get(__ret__, 'redis_settings'),
        redshift_settings=pulumi.get(__ret__, 'redshift_settings'),
        s3_settings=pulumi.get(__ret__, 's3_settings'),
        secrets_manager_access_role_arn=pulumi.get(__ret__, 'secrets_manager_access_role_arn'),
        secrets_manager_arn=pulumi.get(__ret__, 'secrets_manager_arn'),
        server_name=pulumi.get(__ret__, 'server_name'),
        service_access_role=pulumi.get(__ret__, 'service_access_role'),
        ssl_mode=pulumi.get(__ret__, 'ssl_mode'),
        tags=pulumi.get(__ret__, 'tags'),
        username=pulumi.get(__ret__, 'username'))


@_utilities.lift_output_func(get_endpoint)
def get_endpoint_output(endpoint_id: Optional[pulumi.Input[str]] = None,
                        tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEndpointResult]:
    """
    Data source for managing an AWS DMS (Database Migration) Endpoint.

    ## Example Usage

    ### Basic Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.dms.get_endpoint(endpoint_id="test_id")
    ```


    :param str endpoint_id: Database endpoint identifier. Identifiers must contain from 1 to 255 alphanumeric characters or hyphens, begin with a letter, contain only ASCII letters, digits, and hyphens, not end with a hyphen, and not contain two consecutive hyphens.
    """
    ...
